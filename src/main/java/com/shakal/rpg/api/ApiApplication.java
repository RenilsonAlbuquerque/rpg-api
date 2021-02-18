package com.shakal.rpg.api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.shakal.rpg.api.model.user.NativeUser;
import com.shakal.rpg.api.repository.user.INativeUserDAO;

@SpringBootApplication
public class ApiApplication implements ApplicationRunner{

	@Autowired
	private INativeUserDAO nativeUserRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	public static void main(String[] args) throws IOException {
		
		SpringApplication.run(ApiApplication.class, args);
		
	}
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		 if(nativeUserRepository.findAll().isEmpty()) {
				String password = bCryptPasswordEncoder.encode("123456");
				this.nativeUserRepository.save(new NativeUser("renilson",password));
				String password2 = bCryptPasswordEncoder.encode("123456");
				this.nativeUserRepository.save(new NativeUser("shakal",password2));
			}
	 }
	

}
