package com.chai.testProj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Random;

@MapperScan("com.chai.testProj.mapper")
@SpringBootApplication
public class SampleController {
    public static void main(String[] args) {
        SpringApplication.run(SampleController.class,args);
    }

}
