package com.kpr.convertcurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("com.kpr.convertcurrency.controller")
public class ConvertCurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertCurrencyApplication.class, args);
		System.out.println(" -------- ConvertCurrencyApplication MS2 --------");
	}

}
