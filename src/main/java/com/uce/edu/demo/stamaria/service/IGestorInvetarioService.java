package com.uce.edu.demo.stamaria.service;

import java.time.LocalDateTime;
import java.util.List;


import com.uce.edu.demo.stamaria.modelo.Inventario;
import com.uce.edu.demo.stamaria.modelo.Producto;

public interface IGestorInvetarioService {
	
	public void consultarReporte(LocalDateTime fecha);
	

}
