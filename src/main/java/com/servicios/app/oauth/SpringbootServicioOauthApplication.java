package com.servicios.app.oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableEurekaClient //habilitar que sea cliente de eureka, es opcional, automaticamente con la dependecia se habilita
@EnableFeignClients
public class SpringbootServicioOauthApplication implements CommandLineRunner{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioOauthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String password="front1234";
		
		for (int i = 0; i < 4; i++) {
			String pwdBcrypt=passwordEncoder.encode(password);
			System.out.println(pwdBcrypt);
		}
	}

}
