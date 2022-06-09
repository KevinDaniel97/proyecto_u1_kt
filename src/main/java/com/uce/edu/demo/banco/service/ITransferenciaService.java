package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;


public interface ITransferenciaService {
	
	public void realizarTransferencia(String ctaOrigen, String ctaDestino,BigDecimal monto);

	public Transferencia buscarPorNumero(String ctaOrigen);
	
	public void actualizar(String ctaOrigen);
	
	public void borrarCuentaBancaria(String ctaOrigen);
}
