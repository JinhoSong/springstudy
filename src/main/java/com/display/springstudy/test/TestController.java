package com.display.springstudy.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class TestController {

    @GetMapping("/healthCheck")
    public String healthCheck(){
        log.info("healthCheck");
        return "healthCheck";
    }

}
