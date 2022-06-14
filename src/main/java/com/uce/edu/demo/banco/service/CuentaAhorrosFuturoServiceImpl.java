package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
@Service
@Qualifier("futuro")
public class CuentaAhorrosFuturoServiceImpl implements ICuentaBancariaService{

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
		BigDecimal interes=saldo.multiply(new BigDecimal(5)).divide(new BigDecimal(100));
		interes=interes.subtract(saldo.divide(new BigDecimal(200)));
		return interes;
	}

}
