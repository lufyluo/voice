package com.voice.esserver.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

	private static EsServerClient esServerClient;
	public static void main(String[] args) {
		esServerClient = new EsServerClient();
		esServerClient.delete();
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
