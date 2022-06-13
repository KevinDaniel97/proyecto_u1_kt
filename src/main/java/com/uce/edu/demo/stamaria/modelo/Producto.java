package com.uce.edu.demo.stamaria.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {

	private String nombreProducto;
	private BigDecimal precioCompra;
	private int cantidad ;
	private LocalDateTime fechaIngreso;

	
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", precioCompra=" + precioCompra + ", cantidad="
				+ cantidad + "]";
	}

	
}
