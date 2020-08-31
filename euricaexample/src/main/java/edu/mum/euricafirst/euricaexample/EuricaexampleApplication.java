package edu.mum.euricafirst.euricaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuricaexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuricaexampleApplication.class, args);
    }

}
