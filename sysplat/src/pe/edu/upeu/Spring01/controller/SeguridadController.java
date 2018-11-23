package pe.edu.upeu.Spring01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeguridadController {

	@GetMapping("/Sedes")
	public String sede() {
		return "sede";
	}
	
}
