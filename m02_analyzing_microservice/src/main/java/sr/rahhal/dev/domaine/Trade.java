package sr.rahhal.dev.domaine;


public class Trade {

    private String eventType;

    private Long eventTime;

    private String symbol;

    private Long aggregationTradeId;

    private String price;

    private String quantity;

    private Long firstTradeId;

    private Long lastTradeId;

    private Long tradeTime;

    private Boolean buyerIsMarketMaker;

    private Boolean ignore;

    public Trade() {
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Long getAggregationTradeId() {
        return aggregationTradeId;
    }

    public void setAggregationTradeId(Long aggregationTradeId) {
        this.aggregationTradeId = aggregationTradeId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Long getFirstTradeId() {
        return firstTradeId;
    }

    public void setFirstTradeId(Long firstTradeId) {
        this.firstTradeId = firstTradeId;
    }

    public Long getLastTradeId() {
        return lastTradeId;
    }

    public void setLastTradeId(Long lastTradeId) {
        this.lastTradeId = lastTradeId;
    }

    public Long getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Long tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Boolean getBuyerIsMarketMaker() {
        return buyerIsMarketMaker;
    }

    public void setBuyerIsMarketMaker(Boolean buyerIsMarketMaker) {
        this.buyerIsMarketMaker = buyerIsMarketMaker;
    }

    public Boolean getIgnore() {
        return ignore;
    }

    public void setIgnore(Boolean ignore) {
        this.ignore = ignore;
    }

    @Override
    public String toString() {
        return "TradeApi{" +
                "eventType='" + eventType + '\'' +
                ", eventTime=" + eventTime +
                ", symbol='" + symbol + '\'' +
                ", aggregationTradeId=" + aggregationTradeId +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                ", firstTradeId=" + firstTradeId +
                ", lastTradeId=" + lastTradeId +
                ", tradeTime=" + tradeTime +
                ", buyerIsMarketMaker=" + buyerIsMarketMaker +
                ", ignore=" + ignore +
                '}';
    }
}
