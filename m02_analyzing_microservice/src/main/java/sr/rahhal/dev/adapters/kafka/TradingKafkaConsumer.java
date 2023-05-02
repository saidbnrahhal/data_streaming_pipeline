package sr.rahhal.dev.adapters.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import sr.rahhal.dev.application.DataTradingProcessor;
import sr.rahhal.dev.v1.TradeRecord;
@Service
public class TradingKafkaConsumer {

    private String TOPIC = "real_time_trading_v1";


    @Autowired
    private DataTradingProcessor dataTradingProcessor;

    @KafkaListener(topics = "real_time_trading_v1", groupId = "group_m02B")
    public void consume(ConsumerRecord<String, TradeRecord> record) {
        System.out.println("-----New message from TOPIC consumed key:"+ record.key());
        System.out.println("-----Value:"+ record.value().toString());
        dataTradingProcessor.process(record.value());
    }
}
