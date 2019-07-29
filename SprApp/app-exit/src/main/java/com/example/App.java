package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * The main example
 *
 * @SpringBootApplication
 * public class ExitCodeApplication {
 *
 * @Bean
 * public ExitCodeGenerator exitCodeGenerator() {
 *   return () -> 42;
 * }
 * public static void main(String[] args) { System.exit(SpringApplication
 * .exit(SpringApplication.run(ExitCodeApplication.class, args))); } }
 */

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        new SpringApplication(App.class).run(args);
    }
    /*
     * The main example
     *
     * @SpringBootApplication
     * public class ExitCodeApplication {
     *
     * @Bean
     * public ExitCodeGenerator exitCodeGenerator() {
     *   return () -> 42;
     * }
     * public static void main(String[] args) {
     *     System.exit(SpringApplication
     *     .exit(SpringApplication.run(ExitCodeApplication.class, args)));
     *   }
     * }
     */

}
