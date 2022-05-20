import java.util.*;

public class Maximize {
    public static Storage stg;

    public static double maxSum = 100;
    private static final ArrayDeque<CoinPricePair> curRoute = new ArrayDeque<>();

    public static void getMaxRoutes() {
        for(String coin : stg.getSwapInfo().keySet()){
            if(stg.canSell(coin)) {
                System.out.println("Start for " + coin);
                start(coin, 100 / stg.getPriceUSD(coin), 1);
            }
        }
    }

    public static void start(String coin, double count, int step) {
        if(count * stg.getPriceUSD(coin) >= maxSum && stg.canSell(coin)){
            maxSum = count * stg.getPriceUSD(coin);
            System.out.print("Step count " + step + ") ");
            for (CoinPricePair c : curRoute) {
                System.out.print(c.getCoin() + " (" + c.getCount() + " = " + c.getPrice() + "$) -> ");
            }
            System.out.println(coin + "(" + count + " = " + count * stg.getPriceUSD(coin) + "$)");
        }
        if(step == 10){
            return;
        }
        curRoute.addLast(new CoinPricePair(coin, count, count * stg.getPriceUSD(coin)));
        for(Map.Entry<String, Double> entry : stg.getSwapInfo().get(coin).entrySet()){
            start(entry.getKey(), count * entry.getValue(), step+1);
        }
        curRoute.removeLast();
    }
}
