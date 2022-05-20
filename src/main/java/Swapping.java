public class Swapping {
    private String pool_address;
    private String pool_id;
    private String base_name;
    private String base_symbol;
    private String base_address;
    private String quote_name;
    private String quote_symbol;
    private String quote_address;
    private double price;
    private double base_volume_24h;
    private double quote_volume_24h;
    private double volume_24h;
    private double volume_7d;
    private double liquidity;
    private double liquidity_atom;

    public void setPool_address(String pool_address) {
        this.pool_address = pool_address;
    }

    public void setPool_id(String pool_id) {
        this.pool_id = pool_id;
    }

    public void setBase_name(String base_name) {
        this.base_name = base_name;
    }

    public void setBase_symbol(String base_symbol) {
        this.base_symbol = base_symbol;
    }

    public void setBase_address(String base_address) {
        this.base_address = base_address;
    }

    public void setQuote_name(String quote_name) {
        this.quote_name = quote_name;
    }

    public void setQuote_symbol(String quote_symbol) {
        this.quote_symbol = quote_symbol;
    }

    public void setQuote_address(String quote_address) {
        this.quote_address = quote_address;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBase_volume_24h(double base_volume_24h) {
        this.base_volume_24h = base_volume_24h;
    }

    public void setQuote_volume_24h(double quote_volume_24h) {
        this.quote_volume_24h = quote_volume_24h;
    }

    public void setVolume_24h(double volume_24h) {
        this.volume_24h = volume_24h;
    }

    public void setVolume_7d(double volume_7d) {
        this.volume_7d = volume_7d;
    }

    public void setLiquidity(double liquidity) {
        this.liquidity = liquidity;
    }

    public void setLiquidity_atom(double liquidity_atom) {
        this.liquidity_atom = liquidity_atom;
    }

    public String getPool_address() {
        return pool_address;
    }

    public String getPool_id() {
        return pool_id;
    }

    public String getBase_name() {
        return base_name;
    }

    public String getBase_symbol() {
        return base_symbol;
    }

    public String getBase_address() {
        return base_address;
    }

    public String getQuote_name() {
        return quote_name;
    }

    public String getQuote_symbol() {
        return quote_symbol;
    }

    public String getQuote_address() {
        return quote_address;
    }

    public double getPrice() {
        return price;
    }

    public double getBase_volume_24h() {
        return base_volume_24h;
    }

    public double getQuote_volume_24h() {
        return quote_volume_24h;
    }

    public double getVolume_24h() {
        return volume_24h;
    }

    public double getVolume_7d() {
        return volume_7d;
    }

    public double getLiquidity() {
        return liquidity;
    }

    public double getLiquidity_atom() {
        return liquidity_atom;
    }
}
