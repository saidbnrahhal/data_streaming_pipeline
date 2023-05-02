package sr.rahhal.dev.adapters.kafka.mapper;

import sr.rahhal.dev.domaine.Trade;
import sr.rahhal.dev.v1.TradeRecord;

public class TradeRecordMapper {
    public static Trade mapToDomain(TradeRecord record){
        Trade trade = new Trade();
        trade.setAggregationTradeId(Long.valueOf(record.getAggregationTradeId()));
        trade.setFirstTradeId(Long.valueOf(record.getFirstTradeId()));
        trade.setIgnore(Boolean.valueOf(record.getIgnore()));
        return trade;

    }
}
