package com.display.springstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringstudyApplication extends SpringBootServletInitializer {

    /**
     * war packing 이후 톰캣에서 자동 배포되려면 SpringBootServletInitializer를 상속받아 configure를 구현해놔야 한다.
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringstudyApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringstudyApplication.class, args);
    }

}
