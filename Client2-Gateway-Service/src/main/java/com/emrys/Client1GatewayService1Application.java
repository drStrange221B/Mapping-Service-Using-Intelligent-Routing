package com.emrys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Client1GatewayService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Client1GatewayService1Application.class, args);
	}

	@RequestMapping(value = "/")
	public String goodbye() {
		return "Good Bye";
	}

	@RequestMapping(value = "/hey")
	public String heyHello() {
		return "Hey Good Bye";
	}

}
