package com.mxh.banktransferbank1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dhb.bank.transfer.orm.dao", "com.dhb.bank.transfer.bank1"})
@MapperScan(basePackages = {"com.dhb.bank.transfer.orm.mapper"})
public class BankTransferBank1Application {

    public static void main(String[] args) {
        SpringApplication.run(BankTransferBank1Application.class, args);
    }

}
