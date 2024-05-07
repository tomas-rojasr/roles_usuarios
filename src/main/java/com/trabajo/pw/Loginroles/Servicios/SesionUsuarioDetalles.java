package com.trabajo.pw.Loginroles.Servicios;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.trabajo.pw.Loginroles.Model.Usuario;

//IMPLEMENTACION DE SESIONES Y ES NECESARIO SECURITY

public interface SesionUsuarioDetalles extends UserDetailsService {
	
	public List<Usuario> buscarTodos();

}
