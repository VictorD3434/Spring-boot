package com.mitocode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mitocode.model.Ususario;
import com.mitocode.repo.IUsuario;
@Service
public class UserService implements UserDetailsService{

	@Autowired
	private IUsuario repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Ususario us = repo.findByNombre(username);
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userDet = new User(us.getNombre(), us.getClave(),roles);
		return userDet;
	}

}
