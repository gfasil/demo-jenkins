package com.fayaman.demojenkins;

import com.fayaman.demojenkins.domain.CustomerContact;
import com.fayaman.demojenkins.repos.CustomerContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJenkinsApplication.class, args);
    }

    @Bean
    public CommandLineRunner smapleData(CustomerContactRepository customerContactRepository){
        return (args )-> {
            customerContactRepository.save(new CustomerContact("admin@gmail.com"));
        };
    }

}
