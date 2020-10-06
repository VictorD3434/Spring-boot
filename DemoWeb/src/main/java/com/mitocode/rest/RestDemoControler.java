package com.mitocode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.repo.IPersona;
import com.mitocode.model.*;

@RestController
@RequestMapping("/personas")
public class RestDemoControler {
	@Autowired
	private IPersona repo;
	@GetMapping
	public List<Persona> listar(){
		
		return repo.findAll();
		
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona per){
		
		repo.save(per);
		
	}
	
	@PutMapping
	public void modificar(@RequestBody Persona per){
		
		repo.save(per);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public void borrar(@PathVariable("id") Integer id){
		
		repo.deleteById(id);
		
	}

}
