package com.example.bean;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

@Component
public class MyException extends Exception implements ExitCodeGenerator {

    @Override
    public int getExitCode() {
        return 67;
    }

    @Override
    public String getMessage() {
        return "++++++++++++++++++++++ This is Exception ++++++++++++++++++++++++";
    }
}