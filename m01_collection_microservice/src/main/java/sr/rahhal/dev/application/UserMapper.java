package sr.rahhal.dev.application;

import sr.rahhal.dev.adapters.websocket.TradeDto;
import sr.rahhal.dev.v1.TradeRecord;

public class UserMapper {

    public static TradeRecord map(TradeDto userApi) {
        return TradeRecord.newBuilder()
                .setAggregationTradeId(String.valueOf(userApi.getAggregationTradeId()))
                .setEventType(String.valueOf(userApi.getEventType()))
                .setEventTime(String.valueOf(userApi.getEventTime()))
                .setSymbol(String.valueOf(userApi.getSymbol()))
                .setAggregationTradeId(String.valueOf(userApi.getAggregationTradeId()))
                .setPrice(String.valueOf(userApi.getPrice()))
                .setQuantity(String.valueOf(userApi.getQuantity()))
                .setFirstTradeId(String.valueOf(userApi.getFirstTradeId()))
                .setLastTradeId(String.valueOf(userApi.getLastTradeId()))
                .setTradeTime(String.valueOf(userApi.getTradeTime()))
                .setBuyerIsMarketMaker(String.valueOf(userApi.getBuyerIsMarketMaker()))
                .setIgnore(String.valueOf(userApi.getIgnore()))
                .build();
    }
}
