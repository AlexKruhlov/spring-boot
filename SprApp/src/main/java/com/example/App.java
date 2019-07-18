package com.example;

import com.example.bean.MyBean;
import com.example.listeners.AppListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;

import static java.util.Collections.singletonList;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication();
//        springApplication.addListeners(new AppListener());
        springApplication.setSources(new HashSet(singletonList(App.class)));
        ConfigurableApplicationContext context = springApplication.run(args);
        MyBean myBean = context.getBean(MyBean.class);
        myBean.sendMessage();
    }
}
