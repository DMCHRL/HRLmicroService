package com.hrl.mircoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class StudentProviderApp8001
{
    public static void main( String[] args )
    {
        SpringApplication.run(StudentProviderApp8001.class, args);
    }
}
