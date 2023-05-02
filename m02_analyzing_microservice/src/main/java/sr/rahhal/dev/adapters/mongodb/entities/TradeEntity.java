package sr.rahhal.dev.adapters.mongodb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class TradeEntity {

    @Id
    private String id;

    @Field("trade_conditions")
    private String tradeConditions;

    private String symbol;

    @Field("trade_timestamp")
    private String tradeTimestamp;

    private String volume;

    @Field("ingest_timestamp")
    private String ingestTimestamp;


    public TradeEntity() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTradeConditions() {
        return tradeConditions;
    }

    public void setTradeConditions(String tradeConditions) {
        this.tradeConditions = tradeConditions;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTradeTimestamp() {
        return tradeTimestamp;
    }

    public void setTradeTimestamp(String tradeTimestamp) {
        this.tradeTimestamp = tradeTimestamp;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIngestTimestamp() {
        return ingestTimestamp;
    }

    public void setIngestTimestamp(String ingestTimestamp) {
        this.ingestTimestamp = ingestTimestamp;
    }
}
