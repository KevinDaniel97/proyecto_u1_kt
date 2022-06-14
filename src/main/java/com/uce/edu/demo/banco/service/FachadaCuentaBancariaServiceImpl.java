package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria{
	
	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaService;
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaServiceA;
	@Autowired
	@Qualifier("futuro")
	private ICuentaBancariaService bancariaServiceF;
	
	
	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public BigDecimal calcaularInteres(String numeroCta) {
		// TODO Auto-generated method stub
		 
		BigDecimal interes= null;
		CuentaBancaria cta= this.bancariaRepository.buscar(numeroCta);
		if(cta.getTipo().equals("A")) {
			//Ahorros
			interes= this.bancariaServiceA.calcularInteres(numeroCta, cta.getSaldo());
		}else if(cta.getTipo().equals("C")){
			//Corriente
			interes= this.bancariaService.calcularInteres(numeroCta, cta.getSaldo());
		}else if(cta.getTipo().equals("F")){
			//Ahorro Futuro
			interes= this.bancariaServiceF.calcularInteres(numeroCta, cta.getSaldo());
		}
		return interes;
	}
	
	

}
