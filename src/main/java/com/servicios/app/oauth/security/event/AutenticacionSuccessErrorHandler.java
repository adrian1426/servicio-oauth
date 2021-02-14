package com.servicios.app.oauth.security.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class AutenticacionSuccessErrorHandler implements AuthenticationEventPublisher{
	
	private Logger log=LoggerFactory.getLogger(AutenticacionSuccessErrorHandler.class);

	@Override
	public void publishAuthenticationSuccess(Authentication authentication) {
		UserDetails user=(UserDetails) authentication.getPrincipal();
		String mensaje="Success Login: "+ user.getUsername();
		System.out.println(mensaje);
		log.info(mensaje);
	}

	@Override
	public void publishAuthenticationFailure(AuthenticationException exception, Authentication authentication) {
		String mensaje="Error login: "+ exception.getMessage();
		System.out.println(mensaje);
		log.error(mensaje);
	}

}
