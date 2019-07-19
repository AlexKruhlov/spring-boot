package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyBean {

    @Value("${myProp}")
    private String myProp;

    @Autowired
    public MyBean(ApplicationArguments applicationArguments) {
        boolean debug = applicationArguments.containsOption("deb");
        List<String> files = applicationArguments.getNonOptionArgs();
        System.out.println("========================= app args = " + debug + "    " + files);
        System.out.println("==========>>> MyProp  " + myProp);
    }
}
