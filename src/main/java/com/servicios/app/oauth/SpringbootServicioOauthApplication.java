package com.servicios.app.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //habilitar que sea cliente de eureka, es opcional, automaticamente con la dependecia se habilita
@EnableFeignClients
public class SpringbootServicioOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioOauthApplication.class, args);
	}

}
