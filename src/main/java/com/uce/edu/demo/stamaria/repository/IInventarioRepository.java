package com.uce.edu.demo.stamaria.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.stamaria.modelo.Inventario;
import com.uce.edu.demo.stamaria.modelo.Producto;

public interface IInventarioRepository {

		public void insertar(Inventario c);
	
		public Inventario buscar(String nombreProducto);
		
		public void eliminar(String numero);

		void actualizar(String nombreProducto);

		public List<Inventario> consultar(LocalDateTime fecha);
	
}
