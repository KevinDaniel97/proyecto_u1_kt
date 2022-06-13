package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;
import com.uce.edu.demo.stamaria.modelo.Inventario;
import com.uce.edu.demo.stamaria.modelo.Producto;
import com.uce.edu.demo.stamaria.service.IGestorInvetarioService;
import com.uce.edu.demo.stamaria.service.IInventarioService;
import com.uce.edu.demo.stamaria.service.IProductoService;

@SpringBootApplication
public class ProyectoU1KtApplication implements CommandLineRunner {

	@Autowired
	private IInventarioService iInventarioService;
	@Autowired
	private IProductoService iProductoService;
	@Autowired
	private IGestorInvetarioService iGestorInventarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Producto prod1 = new Producto();
		Producto prod2 = new Producto();
		Producto prod3 = new Producto();
		Producto prod4 = new Producto();
		Producto prod5 = new Producto();
		Inventario inventarioProd = new Inventario();
		
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
		
		
		this.iProductoService.ingresarProducto(prod1);
		this.iProductoService.ingresarProducto(prod2);
		this.iProductoService.ingresarProducto(prod3);
		this.iProductoService.ingresarProducto(prod4);
		this.iProductoService.ingresarProducto(prod5);
		
		List<Producto> listaProd= new ArrayList<>();
		listaProd.add(prod1);
		listaProd.add(prod2);
		listaProd.add(prod3);
		listaProd.add(prod4);
		listaProd.add(prod5);
		inventarioProd.setListaProductos(listaProd);
		this.iInventarioService.InsertarInventario(inventarioProd);
		this.iGestorInventarioService.consultarReporte(LocalDateTime.of(2021, 10, 12, 15, 15));
	
	}

	

}
