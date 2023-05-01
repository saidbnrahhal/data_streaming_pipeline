package sr.rahhal.dev.adapters.websocket;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TradeDto {

    @JsonProperty("e")
    private String eventType;

    @JsonProperty("E")
    private Long eventTime;

    @JsonProperty("s")
    private String symbol;

    @JsonProperty("a")
    private Long aggregationTradeId;

    @JsonProperty("p")
    private String price;

    @JsonProperty("q")
    private String quantity;

    @JsonProperty("f")
    private Long firstTradeId;

    @JsonProperty("l")
    private Long lastTradeId;

    @JsonProperty("T")
    private Long tradeTime;

    @JsonProperty("m")
    private Boolean buyerIsMarketMaker;

    @JsonProperty("M")
    private Boolean ignore;

    public TradeDto() {
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
