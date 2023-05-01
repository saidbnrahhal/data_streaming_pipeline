package sr.rahhal.dev.adapters.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import sr.rahhal.dev.application.UserMapper;
import sr.rahhal.dev.application.UserProcessor;

@Service()
public class UserApiFinder {

    private static Logger log = LoggerFactory.getLogger(UserApiFinder.class);

    public static final String api = "wss://stream.binance.com:9443/ws/btcusdt@trade";


    private final UserProcessor userProcessor;

    WebClient webClient = WebClient.builder()
            .baseUrl(api)
            .defaultCookie("cookie-name", "cookie-value")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();

    public UserApiFinder(UserProcessor userService) {
        this.userProcessor = userService;
    }

}
