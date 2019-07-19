package com.example.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class AppListener implements ApplicationListener<ApplicationEvent> {
    private static final String MARKER = "EVENT ===================================== ";

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(MARKER + applicationEvent);
    }
}
