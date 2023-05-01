package sr.rahhal.dev;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import sr.rahhal.dev.application.UserProcessor;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner initializeConnection(
            UserProcessor rsvpsWebSocketHandler) {
        return args -> {
            WebSocketClient rsvpsSocketClient = new StandardWebSocketClient();

            rsvpsSocketClient.doHandshake(
                    rsvpsWebSocketHandler, "wss://stream.binance.com:9443/ws/btcusdt@trade");
        };
    }
}
