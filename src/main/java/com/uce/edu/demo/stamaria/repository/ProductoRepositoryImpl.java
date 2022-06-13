package com.uce.edu.demo.stamaria.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.stamaria.modelo.Producto;
@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("se ha insertado un objeto en el inventario: "+p);
	}

	@Override
	public Producto buscar(String nombreProducto ) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el producto: "+nombreProducto);
		Producto prod= new Producto();
		prod.setNombreProducto(nombreProducto);
		return prod;	
	}

	@Override
	public void actualizar(String nombreProducto) {
		// TODO Auto-generated method stub
		System.out.println("inventario actualizado: "+nombreProducto);

	}

	@Override
	public void eliminar(String nombreProducto) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado: "+nombreProducto);
	}

	@Override
	public List<Producto> buscar(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		System.out.println("Reporte de los productos ingresados a la bodega por fecha: "+ fechaIngreso);
		List<Producto> listaProductos = new ArrayList<Producto>();
		
		Producto prod1 = new Producto();
		Producto prod2 = new Producto();
		Producto prod3 = new Producto();
		Producto prod4 = new Producto();
		Producto prod5 = new Producto();
		
		
		prod1.setNombreProducto("Coca cola");
		prod1.setCantidad(25);
		prod1.setPrecioCompra(new BigDecimal(2.75));
		prod1.setFechaIngreso(LocalDateTime.of(2020, 10, 12, 10, 15));
		
		prod2.setNombreProducto("Huevos");
		prod2.setCantidad(100);
		prod2.setPrecioCompra(new BigDecimal(3.75));
		prod2.setFechaIngreso(LocalDateTime.of(2020, 10, 13, 7, 45)); 
		
		prod3.setNombreProducto("Acetie");
		prod3.setCantidad(100);
		prod3.setPrecioCompra(new BigDecimal(5.50));
		prod3.setFechaIngreso(LocalDateTime.of(2021, 11, 11, 20, 50)); 
		
		prod4.setNombreProducto("Atun");
		prod4.setCantidad(40);
		prod4.setPrecioCompra(new BigDecimal(1.50));
		prod4.setFechaIngreso(LocalDateTime.of(2021, 12, 11, 7, 10)); 
		
		prod5.setNombreProducto("Snak");
		prod5.setCantidad(20);
		prod5.setPrecioCompra(new BigDecimal(0.50));
		prod5.setFechaIngreso(LocalDateTime.of(2021, 11, 11, 4, 10));
		
		listaProductos.add(prod1);
		listaProductos.add(prod2);
		listaProductos.add(prod3);
		listaProductos.add(prod4);
		listaProductos.add(prod5);
			
		return listaProductos;
	}

	

	


}
