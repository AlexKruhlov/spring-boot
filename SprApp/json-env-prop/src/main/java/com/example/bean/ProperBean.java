package com.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Is needed to be done first:
 * set SPRING_APPLICATION_JSON={"title":"////////////////////////////////////test","active":true}
 *
 * Than: mvn spring-boot:run
 */
@Component
public class ProperBean{

    @Value("${title}")
    private String title;
    @Value("${active}")
    private boolean active;

    @PostConstruct
    private void postConstruct() {
        System.out.printf("title= %s, active= %s%n", title, active);
    }
}
