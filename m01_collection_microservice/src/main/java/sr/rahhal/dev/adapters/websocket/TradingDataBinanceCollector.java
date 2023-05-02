package sr.rahhal.dev.adapters.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import sr.rahhal.dev.application.TradingDataBinanceProcessor;
import sr.rahhal.dev.exception.BusinessException;

@Service()
public class TradingDataBinanceCollector {

    private static Logger log = LoggerFactory.getLogger(TradingDataBinanceCollector.class);

    public static final String uriBinance = "wss://stream.binance.com:9443/ws/btcusdt@trade";


    private final TradingDataBinanceProcessor tradingDataBinanceProcessor;

    public void startCollecting() {
        log.info("Starting web socket communication with binance");
        try {
            WebSocketClient binanceBTCSocketClient = new StandardWebSocketClient();

            binanceBTCSocketClient.doHandshake(
                    tradingDataBinanceProcessor, uriBinance);
        } catch (RuntimeException exception) {
            log.info("Error while starting communication with binance", exception);
            throw new BusinessException("Error while starting communication with binance", exception);
        }
    }

    public TradingDataBinanceCollector(TradingDataBinanceProcessor userService) {
        this.tradingDataBinanceProcessor = userService;
    }

}
