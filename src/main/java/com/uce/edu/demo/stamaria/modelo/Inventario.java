package com.uce.edu.demo.stamaria.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Inventario {

	private LocalDateTime fecha =LocalDateTime.now();
	private List<Producto> listaProductos;
	
	//set y get
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	@Override
	public String toString() {
		return "Inventario [fecha=" + fecha + ", listaProductos=" + listaProductos + "]";
	}





}
