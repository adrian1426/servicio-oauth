package com.servicios.app.oauth.services;

import com.servicios.app.commons.usuarios.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUserName(String username);

}
