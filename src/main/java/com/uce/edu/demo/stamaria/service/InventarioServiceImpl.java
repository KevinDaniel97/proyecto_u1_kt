package com.uce.edu.demo.stamaria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.stamaria.modelo.Inventario;
import com.uce.edu.demo.stamaria.modelo.Producto;
import com.uce.edu.demo.stamaria.repository.IInventarioRepository;
import com.uce.edu.demo.stamaria.repository.IProductoRepository;
@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;
	
	@Override
	public void InsertarInventario(Inventario p) {
		// TODO Auto-generated method stub
	this.iInventarioRepository.insertar(p);
	}

	@Override
	public Inventario buscarInventario(Inventario p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarInventario(Inventario p) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(null);
	}

	@Override
	public void borrarInventario(String nombreProducto) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.eliminar(nombreProducto);
	}
	@Override
	public List<Producto> consultar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		//no hay ninguna logica del negocio
		return null;
	}

}
