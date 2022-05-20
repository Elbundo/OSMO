import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Storage {
    final private HashMap<String, HashMap<String, Double>> swapInfo = new HashMap<>();
    final private ArrayList<String> names = new ArrayList<>();
    final public Map<String, Double> usd = new HashMap<>();

    public Storage(){
        names.add("CRO");
        names.add("DVPN");
        names.add("AKT");
        names.add("OSMO");
        names.add("IRIS");
        names.add("ATOM");
        names.add("SCRT");
        names.add("BAND");
        names.add("FET");
        names.add("JUNO");
    }

    public void setSwap(String from, String to, Double val){
        if(!swapInfo.containsKey(from))
            swapInfo.put(from, new HashMap<>());
        swapInfo.get(from).put(to, val);
        setPriceUSD(from);
        setPriceUSD(to);
    }

    public double getSwapPrice(String from, String to){
        return swapInfo.get(from).get(to);
    }
    public double getPriceUSD(String coin){
        return usd.get(coin);
    }

    public void setPriceUSD(String coin){
        if(!usd.containsKey(coin)) {
            try {
                usd.put(coin, OsmoAPI.getPrice(coin));
            } catch (IOException e) {
                System.out.println("For " + coin + " has no price in usd");
            }
        }
    }
    public HashMap<String, HashMap<String, Double>> getSwapInfo(){
        return swapInfo;
    }

    public boolean canSell(String coin){
        return names.contains(coin);
    }
}
