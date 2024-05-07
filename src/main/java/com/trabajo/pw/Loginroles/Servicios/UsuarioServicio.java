package com.trabajo.pw.Loginroles.Servicios;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.*;
import com.trabajo.pw.Loginroles.Model.Rol;
import com.trabajo.pw.Loginroles.Model.Usuario;
import com.trabajo.pw.Loginroles.Repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicio implements SesionUsuarioDetalles {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;


	public Usuario registrar() {
		
		Usuario user = new Usuario("Usuario", "Parqueadero", "admin", "1234", Arrays.asList(new Rol("ROLE_ADMIN")));
		
		return usuarioRepositorio.save(user);
	}
	




	@Override
	public List<Usuario> buscarTodos() {
		return usuarioRepositorio.findAll();
	}
	
	// LA MAGIA DEL LOGIN
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//Buscar el usuario
		Usuario user = usuarioRepositorio.findByUsername(username);
		
		if(user == null) {
			
			throw new UsernameNotFoundException("USUARIO Y CONTRASEÑA NO VALIDOS");
		}
		
		// Con este vamos a obtener la autenticacion --- Va a ser el objeto de sesion
		return new User(user.getUsername(), user.getPassword(), obtenerRol(user.getRoles()));

		
	}
	
	private Collection<? extends GrantedAuthority> obtenerRol(Collection<Rol> roles){
		
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
	}

}
