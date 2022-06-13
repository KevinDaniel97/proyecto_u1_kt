package com.uce.edu.demo.stamaria.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.stamaria.modelo.Producto;
import com.uce.edu.demo.stamaria.repository.IProductoRepository;
@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Override
	public void ingresarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.insertar(p);
	}

	@Override
	public Producto buscarProducto(String nombreProducto) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(nombreProducto);
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(null);
	}

	@Override
	public void borrarProducto(String nombreProducto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminar(nombreProducto);
	}

	@Override
	public List<Producto> buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(fecha);
	}


}
