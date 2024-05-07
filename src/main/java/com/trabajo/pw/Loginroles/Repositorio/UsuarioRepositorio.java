package com.trabajo.pw.Loginroles.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabajo.pw.Loginroles.Model.Usuario;

// AQUI SE ADJUNTA EL TEMA DE LA SQL 

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	
	//Query(SELECT * FROM USUARIO WHERE USERNAME =?1 AND PASSWORD = ?2
	//public Usuario findByUsernameAndPassword();
	
	public Usuario findByUsername(String username);

}
