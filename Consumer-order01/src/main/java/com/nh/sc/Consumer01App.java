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
public class Consumer01App
{
    public static void main( String[] args )
    {

        SpringApplication.run(Consumer01App.class);
    }
}
