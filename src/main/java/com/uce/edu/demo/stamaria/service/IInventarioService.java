package com.uce.edu.demo.stamaria.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.stamaria.modelo.Inventario;
import com.uce.edu.demo.stamaria.modelo.Producto;

public interface IInventarioService {

	public void InsertarInventario(Inventario p);
	
	public Inventario buscarInventario(Inventario p);
	
	public void actualizarInventario (Inventario p);
	
	public void borrarInventario(String nombrePreodcuto);
	
	public List<Producto> consultar(LocalDateTime fecha);

}
