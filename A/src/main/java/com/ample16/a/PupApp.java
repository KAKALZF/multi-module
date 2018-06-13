package com.ample16.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by layne on 2018/5/17.
 */
@SpringBootApplication
public class PupApp {
    public static void main(String[] args) {
        SpringApplication.run(PupApp.class, args);
    }
}
