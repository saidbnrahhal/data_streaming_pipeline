package sr.rahhal.dev.adapters.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sr.rahhal.dev.adapters.websocket.TradingDataBinanceCollector;
import sr.rahhal.dev.exception.BusinessException;

@RestController
public class TradeController {

    private static Logger log = LoggerFactory.getLogger(TradeController.class);
    @Autowired
    private TradingDataBinanceCollector tradingDataBinanceCollector;

    private static Boolean lastCallWasSuccess = false;

    @GetMapping("/collecting")
    public ResponseEntity<String> startCollecting() {
        try {
            if(!lastCallWasSuccess){
                tradingDataBinanceCollector.startCollecting();
                lastCallWasSuccess = true;
                return ResponseEntity.accepted()
                        .body("Status: OK, Start collecting data ................");
            }
            //TODO add more logic
            return ResponseEntity.accepted()
                    .body("Status: OK, Already running ................");
        } catch (BusinessException exception) {
            lastCallWasSuccess = false;
            return ResponseEntity.internalServerError()
                    .body("Status: KO, error in starting the data collecting.");
        }
    }

}
