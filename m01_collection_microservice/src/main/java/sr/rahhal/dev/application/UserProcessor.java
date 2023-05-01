package sr.rahhal.dev.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;
import sr.rahhal.dev.adapters.kafka.UserKafkaProducerAdapter;
import sr.rahhal.dev.adapters.websocket.TradeDto;

@Service
public class UserProcessor extends AbstractWebSocketHandler {

    private static Logger log = LoggerFactory.getLogger(UserProcessor.class);


    @Autowired
    UserKafkaProducerAdapter userKafkaProducerAdapter;

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    @Override
    public void handleMessage(WebSocketSession session,
                              WebSocketMessage<?> message) throws JsonProcessingException {
        System.out.println(message.getPayload());
        TradeDto tradeDto = jacksonObjectMapper.readValue(message.getPayload().toString(), TradeDto.class);
        userKafkaProducerAdapter.send(tradeDto);
    }
}
