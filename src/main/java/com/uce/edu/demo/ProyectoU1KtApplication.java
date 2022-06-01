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

@SpringBootApplication
public class ProyectoU1KtApplication implements CommandLineRunner {

//  1) DI por Atributo
//	@Autowired
//	private CitaMedica cita;

//  2) DI por constructor
//	@Autowired
//	private CitaMedica2 cita;

//-------------------------------------------
//  1) DI por Atributo
	@Autowired
	private Matricula3 matricula1;

//  2) DI por metodo SET
	@Autowired
	private Matricula2 matricula2;
	
//  3) DI por contructor
	@Autowired
	private Matricula matricula3;

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con spring framework");

		//String respuesta = cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 14);
		//System.out.println(respuesta);
		String respuesta = matricula1.matricular(LocalDateTime.now(), "Kevin", "Toapanta", LocalDateTime.now(), "Programacion Avanzada", 6);
		System.out.println(respuesta);
		
		String respuesta2 = matricula2.matricular(LocalDateTime.now(), "Kevin", "Toapanta", LocalDateTime.now(), "Programacion Avanzada", 6);
		System.out.println(respuesta2);
		
		String respuesta3 = matricula3.matricular(LocalDateTime.now(), "Kevin", "Toapanta", LocalDateTime.now(), "Programacion Avanzada", 6);
		System.out.println(respuesta3);
		
		
	
	}

}
