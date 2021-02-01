package com.servicios.app.oauth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.servicios.app.commons.usuarios.models.entity.Usuario;

@FeignClient(name = "servicio-usuarios") //nombre del microservicio al que nos queremos comunicar
public interface UsuarioFeignClient {
	
	@GetMapping("/usuarios/search/findUsername")
	public Usuario findByUsername(@RequestParam String user);

}
