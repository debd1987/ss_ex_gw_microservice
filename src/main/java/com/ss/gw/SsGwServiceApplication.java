package com.ss.gw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import lombok.extern.slf4j.Slf4j;

@EnableZuulProxy
@SpringBootApplication
@Slf4j
public class SsGwServiceApplication {

	public static void main(final String[] args) {
		log.info("Starting API Gateway server {} ");

		SpringApplication.run(SsGwServiceApplication.class, args);
	}
}
