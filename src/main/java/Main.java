import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Storage stg = new Storage();
        Request r = null;
        try {
            r = OsmoAPI.getSwapping();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Swapping[] swp_arr = r.getData();
        int i = 0;
        for(Swapping swp : swp_arr) {
            stg.setSwap(swp.getQuote_symbol(), swp.getBase_symbol(), swp.getPrice());
            stg.setSwap(swp.getBase_symbol(), swp.getQuote_symbol(), 1 / swp.getPrice());
        }
        for(Map.Entry<String, HashMap<String, Double>> from : stg.getSwapInfo().entrySet()){
            System.out.println(from.getKey() + " (" + stg.getPriceUSD(from.getKey()) + ")");
            for(Map.Entry<String, Double> to : from.getValue().entrySet()){
                System.out.println("\t" + to.getKey() + " (" + stg.getPriceUSD(to.getKey()) + ")" + " = " + to.getValue());
            }
        }
        Maximize.stg = stg;
        Maximize.getMaxRoutes();
    }
}
