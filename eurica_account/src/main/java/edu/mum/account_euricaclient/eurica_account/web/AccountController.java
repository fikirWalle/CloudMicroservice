package edu.mum.account_euricaclient.eurica_account.web;

import edu.mum.account_euricaclient.eurica_account.domain.Account;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

     @RequestMapping("account/{customerid}")
    public Account getname(@PathVariable String customerId){

            return new Account("123456","654321");


    }
}
