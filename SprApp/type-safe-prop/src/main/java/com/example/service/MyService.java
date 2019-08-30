package com.example.service;

import com.example.conf.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.System.out;

@Service
public class MyService {

    private final MyProperties myConfiguration;

    @Autowired
    public MyService(MyProperties myConfiguration) {
        this.myConfiguration = myConfiguration;
    }

    public void printProperties() {
        out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                "\nIs run: " + myConfiguration.isRun() +
                "\nPriority number: " + myConfiguration.getPriority());
    }
}
