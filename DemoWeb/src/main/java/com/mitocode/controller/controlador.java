package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mitocode.model.Persona;
import com.mitocode.repo.IPersona;

@Controller
public class controlador {
	
	@Autowired
	private IPersona repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Persona p = new Persona();
		p.setIdPersona(2);
		p.setNombre("Jose Enrique");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/listar")
	public String greeting(Model model) {
		
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}

}
