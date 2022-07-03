package com.mxh.banktransferbank1;

import com.mxh.banktransfer.api.Bank1Service;
import com.mxh.banktransfer.api.BankAccountService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService(version = "1.0.0", tag = "red", weight = 100)
public class Bank1ServiceImpl implements Bank1Service {

    @Autowired
    BankAccountService bankAccountService;

    @Override
    public Boolean transfer(String tid,int customerId, int amount) {
        this.bankAccountService.subtractAccountBalance(tid,customerId,amount);
        return true;
    }
}