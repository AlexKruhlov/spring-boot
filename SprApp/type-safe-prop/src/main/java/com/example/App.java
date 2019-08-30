package com.example;

import com.example.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplication(App.class).run(args);
        MyService myService = applicationContext.getBean(MyService.class);
        myService.printProperties();
    }
}
