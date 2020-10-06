package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mitocode.repository.InPersona;
import com.mitocode.repository.PersonaIm;

@Service
public class PersonaServiceImpl implements IPersonaService{
	@Autowired
	@Qualifier("persona2")
	private InPersona repo;
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		//repo = new PersonaIm();
		repo.registrar(nombre);
	}

}
