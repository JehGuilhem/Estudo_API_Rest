package com.algaworks.osworks.core;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
//por ser uma biblioteca de terceiros e não spring é necessário configurar para o spring conseguir entender
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
