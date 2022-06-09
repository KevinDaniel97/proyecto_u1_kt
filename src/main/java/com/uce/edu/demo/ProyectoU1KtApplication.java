package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1KtApplication implements CommandLineRunner {
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private IDepositoService depositoService; 
	
	@Autowired
	private IRetiroService retiroService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TRANSFERENCIA");
		this.iTransferenciaService.realizarTransferencia("12", "13", new BigDecimal(55));
		this.iTransferenciaService.buscarPorNumero("12");
		this.iTransferenciaService.actualizar("12");
		this.iTransferenciaService.borrarCuentaBancaria("12");
		
		System.out.println("DEPOSITO");
		this.depositoService.realizarDeposito("14", new BigDecimal(50));
		this.depositoService.buscarDeposito("14");
		this.depositoService.actualizarDeposito("14");
		this.depositoService.borrarDeposito("14");
		
		System.out.println("RETIRO");
		this.retiroService.realizarRetiro("20", new BigDecimal(10));
		this.retiroService.buscarPorNumero("20");
		this.retiroService.actualizar("14");
		this.retiroService.borrarRetiroCuenta("20", new BigDecimal(10));
	
	
	}

	

}
