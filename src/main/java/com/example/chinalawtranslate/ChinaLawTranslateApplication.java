package com.example.chinalawtranslate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ChinaLawTranslateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChinaLawTranslateApplication.class, args);
        log.info("spring-boot-cxf-service启动!");
    }

}
