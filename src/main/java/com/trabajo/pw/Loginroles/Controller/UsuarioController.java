package com.trabajo.pw.Loginroles.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsuarioController {
	
	@GetMapping
	public String usuarioIndex() {
		return "usuario";
	}

}
