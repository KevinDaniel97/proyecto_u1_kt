package com.uce.edu.demo.stamaria.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.stamaria.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void insertar(Inventario p) {
		// TODO Auto-generated method stub
		System.out.println("se ha insertado objetos en el inventario: "+p);
	}

	@Override
	public void actualizar(String nombreProducto) {
		// TODO Auto-generated method stub
		System.out.println("inventario actualizado: "+nombreProducto);

	}
	@Override
	public Inventario buscar(String nombreProducto) {
		System.out.println("se ha insertado objetos en el inventario: "+nombreProducto);
//		Inventario invt1= new Inventario();
//		invt1.setProducto(null);
//		invt1.setFecha(LocalDateTime.of(2020,12, 4, 5, 13));
		return null;
	}
	

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Inventario> consultar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		//List<Inventario> listaConsultada= new ArrayList<>();
		//return listaConsultada;
		return null;
	}



	
	

}
