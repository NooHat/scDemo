package com.nh.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider01App
{
    public static void main( String[] args )
    {
        SpringApplication.run(Provider01App.class);
    }
}
