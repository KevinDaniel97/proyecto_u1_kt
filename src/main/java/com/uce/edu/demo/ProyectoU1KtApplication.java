package com.uce.edu.demo;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.editorial.Service.IContratoService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;


@SpringBootApplication
public class ProyectoU1KtApplication implements CommandLineRunner {
	
	
	@Autowired
	private ProfesorGeneral general;

	@Autowired
	private ProfesorGeneral general1;

	@Autowired
	private ProfesorMateria materia;

	@Autowired
	private ProfesorMateria materia1;

	@Autowired
	private IMatriculaService iMatriculaService;

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("EJPEMPLO SINGLETON");
		this.general.setNombre("Kevin");
		this.general.setApellido("Toapanta");
	
		System.out.println(this.general1);
		System.out.println("--------------");
		System.out.println(this.general1);
		this.general1.setNombre("Pepito");
		System.out.println("--------------");
		System.out.println(this.general);
		System.out.println("--------------");
		System.out.println(this.general1);

		System.out.println("EJPEMPLO POTOTIPE");
		this.materia.setNombre("Daniel");
		this.materia.setApellido("Teran");
		System.out.println(this.materia);
		System.out.println("-----------------");
		System.out.println(this.materia1);


		Matricula matricula1=new Matricula();
		matricula1.setEstudiante(new Estudiante());
		matricula1.setMateria(new ArrayList<Materia>());
		matricula1.setNumero("1234");
		this.iMatriculaService.ingresarMatricula(matricula1);
	}

}
