package com.example;

import com.example.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JugadoresApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JugadoresApplication.class, args);
		JugadorService jugadorService=context.getBean(JugadorService.class);


// Esta es la funcion donde ira toda la chicha dentro del Service
		jugadorService.crearCosas();
	}
}
