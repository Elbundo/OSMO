public class CoinPrice {
    private double price;
    private double q24h_change;

    public CoinPrice(double price, double q24h_change) {
        this.price = price;
        this.q24h_change = q24h_change;
    }

    public double getPrice() {
        return price;
    }

    public double getQ24h_change() {
        return q24h_change;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQ24h_change(double q24h_change) {
        this.q24h_change = q24h_change;
    }
}
