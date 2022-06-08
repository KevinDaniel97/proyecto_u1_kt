package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Deposito {

	private LocalDateTime fecha;
	private String numeroCuentaDestino;
	private BigDecimal monto;
	
	
	@Override
	public String toString() {
		return "Deposito [fecha=" + fecha + ", numeroCuenta=" + numeroCuentaDestino + ", monto=" + monto + "]";
	}
	
	//set y get
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}

	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}

	
	
}
