package com.mxh.banktransferclient;

import com.mxh.banktransfer.api.Bank1Service;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
@Slf4j
public class BankTransferClientApplication {

    @DubboReference(version = "1.0.0") //, url = "dubbo://127.0.0.1:12345")
    private Bank1Service bank1Service;

    public static void main(String[] args) {
        SpringApplication.run(BankTransferClientApplication.class, args);
    }


    @Bean
    public ApplicationRunner runner() {
        return args -> {
            int customerid = 10000;
            int amount = 500;
            String tid = UUID.randomUUID().toString();
            bank1Service.transfer(tid, customerid, amount);
            log.info("customerid {} transfer amount {} ...", customerid, amount);
        };
    }
}
