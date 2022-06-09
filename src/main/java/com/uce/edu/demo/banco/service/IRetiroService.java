package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {
	
	public void realizarRetiro(String numeroCuentaOrigen, BigDecimal monto);
	
	public Retiro buscarPorNumero(String numeroCuentaOrigen);
	
	public void actualizar(String numeroCuentaOrigen);
	
	public void borrarRetiroCuenta(String numeroCuentaOrigen,  BigDecimal monto);

}
