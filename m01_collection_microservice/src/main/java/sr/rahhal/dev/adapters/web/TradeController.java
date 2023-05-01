package sr.rahhal.dev.adapters.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sr.rahhal.dev.adapters.websocket.UserApiFinder;

@RestController
public class TradeController {

    private static Logger log = LoggerFactory.getLogger(TradeController.class);
    @Autowired
    private UserApiFinder userApiFinder;

    @GetMapping("/collecting")
    public String startCollecting() {
        return "Start collecting data ................";

    }

}
