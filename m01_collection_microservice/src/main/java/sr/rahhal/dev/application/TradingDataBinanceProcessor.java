package sr.rahhal.dev.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;
import sr.rahhal.dev.adapters.kafka.TradingKafkaProducerAdapter;
import sr.rahhal.dev.adapters.websocket.TradeDto;

@Component
public class TradingDataBinanceProcessor extends AbstractWebSocketHandler {

    private static Logger log = LoggerFactory.getLogger(TradingDataBinanceProcessor.class);


    @Autowired
    TradingKafkaProducerAdapter tradingKafkaProducerAdapter;

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    @Override
    public void handleMessage(WebSocketSession session,
                              WebSocketMessage<?> message)  {
        System.out.println(message.getPayload());
        try {
            TradeDto tradeDto = jacksonObjectMapper.readValue(message.getPayload().toString(), TradeDto.class);
            tradingKafkaProducerAdapter.send(tradeDto);
        }catch (JsonProcessingException exception){
            log.error("Error while deserializing data from web server",exception);
        }catch (RuntimeException exception){
            log.error("Error while processing data from web server",exception);
        }
    }
}
