package com.uce.edu.demo.stamaria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.stamaria.modelo.Producto;
import com.uce.edu.demo.stamaria.repository.IProductoRepository;

@Service
public class GestorInventarioServiceImpl implements IGestorInvetarioService {

	
	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public void consultarReporte(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		List<Producto> listaProd= this.iProductoRepository.buscar(fecha);
		List<Producto> listaFinal = new ArrayList<>();

		for (Producto pr : listaProd) {
			if (pr.getFechaIngreso().isAfter(fecha)) {

				BigDecimal pc = pr.getPrecioCompra();
				BigDecimal g = pc.multiply(new BigDecimal(0.1));
				BigDecimal iva=pc.multiply(new BigDecimal(0.12));
				BigDecimal pv=pc.add(g).add(iva);
				pr.setPrecioCompra(pv);
				listaFinal.add(pr);
			}
		}
		consola (listaFinal);
	}

	public void consola(List<Producto> listaProductos) {
		for (Producto p : listaProductos) {
			System.out.println(p.getNombreProducto() + "-" + p.getCantidad() + "-" + p.getPrecioCompra()+ "-"+ p.getFechaIngreso());

		}

	}
		
	
	
	

	

	
}
