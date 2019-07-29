package com.example.bean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Example java -jar app-runner-1.0-SNAPSHOT.jar flag=true tag=false
 * As a result we will get 2 String parameters [flag=true, tag=false]
 */

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        out.println("++++++++++++++ I'm run() and I can see " + Arrays.toString(args));
        throw new MyException();
    }
}
