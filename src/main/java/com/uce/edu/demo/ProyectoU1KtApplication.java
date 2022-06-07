package com.uce.edu.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1KtApplication implements CommandLineRunner {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//ESTUDIANTE 1
		System.out.println("ESTUDIANTE");
		Estudiante e =new Estudiante();	
		e.setNombre("Kevin");
		e.setApellido("Toapanta");
		e.setCedula("1725845869");
		this.estudianteService.ingresarEstudiante(e);
		//ESTUDIANTE 2
		Estudiante e1 =new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("101548869");
		this.estudianteService.ingresarEstudiante(e1);
		
		//usamos los 3 metodos restantes para estudiante
		
		e.setCedula("1725845866");
		this.estudianteService.actualizarEstudiante(e1);
		this.estudianteService.buscarPorApellido("Toapanta");
		this.estudianteService.borrarEstudiante("1725845869");

//-----------------------------------------------------------------
		
		//MATERIA 
		System.out.println("MATERIA");
		Materia m =new Materia();	
		m.setNombre("Programacion");
		m.setSemestre("Sexto");
		this.materiaService.ingresarMateria(m);
	
		
		//usamos los 3 metodos restantes para materia
		m.setNombre("Programacion");
		this.materiaService.actualizarMateria(m);
		this.materiaService.buscarPorNombre("Programacion");
		this.materiaService.borrarMateria("Programacion");
			
//-----------------------------------------------------------------		
		//MATRICULA
		System.out.println("MATRICULA");
		Matricula mt =new Matricula();	
		mt.setNumero("001");
		mt.setEstudiante(e);
		this.matriculaService.ingresarMatricula(mt);
		
		//usamos los 3 metodos restantes para Matricula
		mt.setNumero("Programacion");
		this.matriculaService.actualizarMatricula(mt);
		this.matriculaService.buscarMatricula("Programacion");
		this.matriculaService.borrarMatricula("Programacion");
		
		
	
	
	
	}

}
