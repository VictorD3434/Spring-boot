package com.mitocode;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mitocode.model.Ususario;
import com.mitocode.repo.IUsuario;

@SpringBootTest
class DemoWebApplicationTests {

	@Autowired
	private IUsuario repo;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void crear() {
		Ususario us = new Ususario();
		us.setId(3);
		us.setNombre("Manuel");
		us.setClave(encoder.encode("manuel343"));
		repo.save(us);

	}

}
