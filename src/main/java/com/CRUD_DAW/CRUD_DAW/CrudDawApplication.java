package com.CRUD_DAW.CRUD_DAW;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDawApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDawApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper(){
	  return new ModelMapper();
	}

}
