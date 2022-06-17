package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.uce.edu.demo.editorial.Contrato;
import com.uce.edu.demo.editorial.Director;
import com.uce.edu.demo.editorial.Editor;
import com.uce.edu.demo.editorial.Trabajador;
import com.uce.edu.demo.editorial.Service.IContratoService;


@SpringBootApplication
public class ProyectoU1KtApplication implements CommandLineRunner {

	@Autowired
	private Director director;
	
	@Autowired
	private Director director1;
	
	@Autowired
	private Editor editor;
	
	@Autowired
	private Editor editor1;
	
	@Autowired
	private IContratoService iContratoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------>EJPEMPLO SINGLETON");
		System.out.println();
		this.director.setNombre("Kevin");
		this.director.setApellido("Toapanta");
		System.out.println(this.director1);
		System.out.println("--------------");
		System.out.println(this.director1);
		this.director1.setNombre("Daniel");
		System.out.println("--------------");
		System.out.println(this.director);
		System.out.println("--------------");
		System.out.println(this.director1);
		System.out.println();
		System.out.println("------>EJPEMPLO POTOTIPE");
		System.out.println();
		this.editor.setNombre("Daniel");
		this.editor.setApellido("Lopez");
		System.out.println(this.editor);
		System.out.println("-----------------");
		System.out.println(this.editor1);
		System.out.println("------------------");
	
		Contrato contrato11=new Contrato();
		contrato11.setTrabajador(new Trabajador());
		contrato11.setArea(new ArrayList<>());
		contrato11.setNumero("1234");
		this.iContratoService.ingresarContrato(contrato11);
	}


	

}
