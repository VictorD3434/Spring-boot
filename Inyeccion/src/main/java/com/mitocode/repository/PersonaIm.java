package com.mitocode.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mitocode.InyeccionApplication;
@Repository
@Qualifier("persona1")
public class PersonaIm implements InPersona{
	private static Logger LOG = LoggerFactory.getLogger(InyeccionApplication.class);
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		LOG.info("Se registro a "+ nombre);
		
	}

}
