package sr.rahhal.dev.adapters.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MO2Controller {

    @GetMapping("/status")
    public String getStatus() {
       return "OK";
    }

}
