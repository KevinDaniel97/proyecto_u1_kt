package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;


public interface ITransferenciaService {
	
	public void realizarTransferencia(String ctaOrigen, String ctaDestino,BigDecimal monto);

	public Transferencia buscarPorNumero(String ctaOrigen);
	
	public void actualizar(String ctaOrigen);
	
	public void borrarCuentaBancaria(String ctaOrigen);
	
	public List<Transferencia> consultar(String cuenta,LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
