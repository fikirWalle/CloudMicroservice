package edu.mum.account_euricaclient.eurica_account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

@EnableDiscoveryClient
public class EuricaAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuricaAccountApplication.class, args);


    }

}
