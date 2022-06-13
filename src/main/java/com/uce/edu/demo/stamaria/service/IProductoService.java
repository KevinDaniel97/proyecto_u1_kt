package com.uce.edu.demo.stamaria.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.stamaria.modelo.Producto;

public interface IProductoService {
	
	
	public void ingresarProducto(Producto p);
	
	public void borrarProducto(String nombreProducto);

	public Producto buscarProducto(String nombreProducto);

	void actualizarProducto(Producto p);
	
	public List<Producto> buscar (LocalDateTime fecha);

}
