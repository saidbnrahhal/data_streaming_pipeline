package sr.rahhal.dev.adapters.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import sr.rahhal.dev.v1.TradeRecord;

@Service
public class UserKafkaProducer {

    private static Logger log = LoggerFactory.getLogger(UserKafkaProducer.class);

    private String TOPIC = "u3_user_v1";
    private final KafkaTemplate<String, TradeRecord> kafkaTemplate;

    @Autowired
    public UserKafkaProducer(KafkaTemplate<String, TradeRecord> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    void sendMessage(TradeRecord user) {
        log.info("sending to topic");
        this.kafkaTemplate.send(this.TOPIC, user.getAggregationTradeId().toString(), user);
    }
}
