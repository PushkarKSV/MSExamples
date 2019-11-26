package com.kpr.curconversionfactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class CurConversionFactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurConversionFactorApplication.class, args);
		System.out.println(" -------- CurConversionFactorApplication MS1 --------");
	}

}
