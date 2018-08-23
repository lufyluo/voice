package com.voice.esserver.providers;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ProvidersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvidersApplication.class, args);
	}
}
