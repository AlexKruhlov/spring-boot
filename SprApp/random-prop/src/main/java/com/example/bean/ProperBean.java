package com.example.bean;

import com.example.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.UUID;

/**
 * Is needed to be done first:
 * set SPRING_APPLICATION_JSON={"title":"////////////////////////////////////test","active":true}
 *
 * Than: mvn spring-boot:run
 */
@Component
public class ProperBean{

    private static Logger log = LoggerFactory.getLogger(App.class);

    @Value("${my.secret.password}")
    private String password;

    @Value("${my.secret.intValue}")
    private Integer intValue;

    @Value("${my.secret.intValueRange}")
    private Integer intValueRange;

    @Value("${my.secret.longValue}")
    private Long longValue;

    @Value("${my.secret.longValueRange}")
    private Long longValueRange;

    @Value("${my.secret.uuid}")
    private UUID uuid;

    @PostConstruct
    private void postConstruct() {
        log.info("Configure Random Property Values using Spring Boot");
        log.info("password: " + password);
        log.info("intValue: " + intValue);
        log.info("intValueRange: " + intValueRange);
        log.info("longValue: " + longValue);
        log.info("longValueRange: " + longValueRange);
        log.info("uuid: " + uuid);
    }
}
