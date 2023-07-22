package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.demo.Filter.zuulFilter;

@SpringBootApplication
@EnableZuulProxy


public class ZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}
	
	@Bean 
	public zuulFilter hello() {
		return new zuulFilter();
	}

}
