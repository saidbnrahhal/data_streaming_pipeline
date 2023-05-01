package sr.rahhal.dev.adapters.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sr.rahhal.dev.adapters.websocket.TradeDto;
import sr.rahhal.dev.application.UserMapper;
import sr.rahhal.dev.v1.TradeRecord;

@Service
public class UserKafkaProducerAdapter {

    private static Logger log = LoggerFactory.getLogger(UserKafkaProducerAdapter.class);

    @Autowired
    UserKafkaProducer userKafkaProducer;

    public void send(TradeDto user) {
        log.info("------User to be sent to topic user-------");
        log.info(user.toString());
        TradeRecord tradeRecord = UserMapper.map(user);
        userKafkaProducer.sendMessage(tradeRecord);
    }
}
