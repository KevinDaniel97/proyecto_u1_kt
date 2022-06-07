package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.matricula.Matricula;
import com.uce.edu.demo.matricula.Matricula2;
import com.uce.edu.demo.matricula.Matricula3;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1KtApplication implements CommandLineRunner {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante e =new Estudiante();
		Estudiante e1 =new Estudiante();


		this.estudianteService.ingresarEstudiante(e);
		e.setNombre("Kevin");
		e.setApellido("Toapanta");
		e.setCedula("1725845869");
		this.estudianteService.ingresarEstudiante(e);
		
		this.estudianteService.ingresarEstudiante(e);
		e.setNombre("Pepito");
		e.setApellido("Perez");
		e.setCedula("101548869");
		
		this.estudianteService.ingresarEstudiante(e1);
		
		
		//usamos los 3 metodos restantes
		
		e.setCedula("1725845866");
		this.estudianteService.actualizarEstudiante(e1);
		
		this.estudianteService.buscarPorApellido("Toapanta");
		this.estudianteService.borrarEstudiante("1725845869");
	}

}
