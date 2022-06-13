package com.uce.edu.demo.stamaria.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.stamaria.modelo.Producto;

public interface IProductoRepository {
			//CRUD
			//C: crear/insertar
			public void insertar(Producto p);
			
			//R: leer/buscar
			public Producto buscar(String nombreProducto);
			
			//U: actualizar
			public void actualizar(String nombreProducto);
				
			//D: eliminar
			public void eliminar(String nombreProducto);

			public List<Producto> buscar(LocalDateTime fechaIngreso);
			

}
