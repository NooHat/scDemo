package com.nh.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.nh.sc"})
@ComponentScan("com.nh.sc")
public class Consumer01App
{
    public static void main( String[] args )
    {

        SpringApplication.run(Consumer01App.class);
    }
}
