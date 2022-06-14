package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
@Service
@Qualifier("ahorros")
public class CuentaBancariaAhorrosServiceImpl implements ICuentaBancariaService {


	@Override
	public void ingresarCuentaBancaria(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarCuentaBancaria(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		//codigo duplicado lo solucionamos con una fachada gestor
		//CuentaBancaria cta= this.bancariaRepository.buscar(numeroCta);
		
		//BigDecimal saldo=null;
		BigDecimal interes=saldo.multiply(new BigDecimal(15)).divide(new BigDecimal(100));

		return interes;
	}

}
