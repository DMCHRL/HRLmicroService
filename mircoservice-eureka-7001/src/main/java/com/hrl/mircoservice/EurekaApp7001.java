package com.hrl.mircoservice;

/**
 * Hello world!
 *
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaApp7001
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaApp7001.class, args);
    }
}



