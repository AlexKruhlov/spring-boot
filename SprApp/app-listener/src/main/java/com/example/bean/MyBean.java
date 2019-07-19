package com.example.bean;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public void sendMessage(){
        System.out.println("=====>>>>=======>>>>> Message was sent");
    }
}
