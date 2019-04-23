package com.nh.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul01App
{
    public static void main( String[] args )
    {
        SpringApplication.run(Zuul01App.class);
    }
}
