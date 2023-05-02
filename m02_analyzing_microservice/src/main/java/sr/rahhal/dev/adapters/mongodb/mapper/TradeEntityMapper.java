package sr.rahhal.dev.adapters.mongodb.mapper;

import sr.rahhal.dev.adapters.mongodb.entities.TradeEntity;
import sr.rahhal.dev.domaine.Trade;

public class TradeEntityMapper {
    public static TradeEntity mapToEntity(Trade trade) {
        TradeEntity tradeEntity = new TradeEntity();
        tradeEntity.setId("id");
        tradeEntity.setSymbol("symbol");
        tradeEntity.setVolume("2323");
        return tradeEntity;
    }
}
