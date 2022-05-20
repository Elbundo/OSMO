public class CoinPricePair {
    private String coin;
    private double count;
    private double price;

    public CoinPricePair(String coin, double count, double price) {
        this.coin = coin;
        this.count = count;
        this.price = price;
    }

    public String getCoin() {
        return coin;
    }

    public double getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
