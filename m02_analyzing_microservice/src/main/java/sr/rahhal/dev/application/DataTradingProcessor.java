package sr.rahhal.dev.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sr.rahhal.dev.adapters.kafka.mapper.TradeRecordMapper;
import sr.rahhal.dev.adapters.mongodb.entities.TradeEntity;
import sr.rahhal.dev.adapters.mongodb.mapper.TradeEntityMapper;
import sr.rahhal.dev.adapters.mongodb.repositories.TradeRepository;
import sr.rahhal.dev.domaine.Trade;
import sr.rahhal.dev.v1.TradeRecord;

import java.util.Objects;

@Service()
public class DataTradingProcessor {

    private static Logger log = LoggerFactory.getLogger(DataTradingProcessor.class);


    @Autowired
    TradeRepository tradeRepository;
    public void process(TradeRecord record) {
        Trade trade = TradeRecordMapper.mapToDomain(record);
        TradeEntity newTradeEntity = TradeEntityMapper.mapToEntity(trade);
        TradeEntity oldEntity = tradeRepository.findById(newTradeEntity.getId()).block();
        if(Objects.nonNull(oldEntity)){
            log.info("entity id already exist");
            return;
        }
        TradeEntity entity = tradeRepository.insert(newTradeEntity).block();
        System.out.println(entity.toString());
    }
}
