package com.display.springstudy.ping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class PingController {

    @GetMapping("/healthCheck")
    public String healthCheck(){
        log.info("healthCheck");
        return "healthCheck";
    }

}
