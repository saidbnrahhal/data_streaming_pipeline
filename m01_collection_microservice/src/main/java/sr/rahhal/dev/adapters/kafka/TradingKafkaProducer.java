package sr.rahhal.dev.adapters.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import sr.rahhal.dev.v1.TradeRecord;

@Service
public class TradingKafkaProducer {

    private static Logger log = LoggerFactory.getLogger(TradingKafkaProducer.class);

    private String TOPIC = "real_time_trading_v1";
    private final KafkaTemplate<String, TradeRecord> kafkaTemplate;

    @Autowired
    public TradingKafkaProducer(KafkaTemplate<String, TradeRecord> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    void sendMessage(TradeRecord user) {
        log.info("sending to topic");
        this.kafkaTemplate.send(this.TOPIC, user.getAggregationTradeId().toString(), user);
    }
}
