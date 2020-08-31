package mum.edu.customereurica.customereurica.web;

import mum.edu.customereurica.customereurica.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    AccountFeign accountFeign;

      @RequestMapping("customer/{customerid}")
    public Account getName(@PathVariable String customerId){

         Account account=accountFeign.getName(customerId);
            return account;


    }

}
@FeignClient("accountservice")
interface  AccountFeign{

      @RequestMapping("account/{customerid}")
    public Account getName(@PathVariable String customerId);






}
