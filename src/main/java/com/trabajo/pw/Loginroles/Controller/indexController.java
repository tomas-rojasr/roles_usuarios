package com.trabajo.pw.Loginroles.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trabajo.pw.Loginroles.Servicios.UsuarioServicio;

@Controller
public class indexController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UsuarioServicio usuarioServicio;
	
	
	
	@GetMapping("/")
	public String Index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String LoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        try {
            UserDetails userDetails = usuarioServicio.loadUserByUsername(username);
            System.out.println(userDetails);
            if (passwordEncoder.matches(password, userDetails.getPassword())) {
                // Autenticación exitosa, redirigir al usuario a la página de inicio
                return "redirect:/user";
            } else {
                model.addAttribute("error", "Nombre de usuario o contraseña incorrectos");
                return "login";
            }
        } catch (UsernameNotFoundException e) {
            model.addAttribute("error", "Nombre de usuario o contraseña incorrectos");
            return "login";
        }
    }


	@GetMapping("/register")
	public String registro(){
		usuarioServicio.registrar();
		return "registro";
	}



}
