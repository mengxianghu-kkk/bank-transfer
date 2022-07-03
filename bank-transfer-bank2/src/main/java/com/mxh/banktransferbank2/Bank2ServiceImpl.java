package com.mxh.banktransferbank2;

import com.mxh.banktransfer.api.Bank2Service;
import com.mxh.banktransfer.api.BankAccountService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService(version = "1.0.0", tag = "red", weight = 100)
public class Bank2ServiceImpl implements Bank2Service {

    @Autowired
    BankAccountService bankAccountService;

    @Override
    public Boolean transfer(String tid,int customerId, int amount) {
        this.bankAccountService.addAccountBalance(tid,customerId,amount);
        return true;
    }
}