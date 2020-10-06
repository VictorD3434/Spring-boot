package com.mitocode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.service.IPersonaService;
import com.mitocode.service.PersonaServiceImpl;

@SpringBootApplication
public class InyeccionApplication implements CommandLineRunner{
	private static Logger LOG = LoggerFactory.getLogger(InyeccionApplication.class);
	@Autowired
	private IPersonaService service;
	public static void main(String[] args) {
		SpringApplication.run(InyeccionApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//LOG.info("Hola mundo :)");
		//LOG.warn("Advertencia");
		//service = new PersonaServiceImpl();
		service.registrar("Victor Manuel");
	}
}
