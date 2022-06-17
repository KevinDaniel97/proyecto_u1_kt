package com.uce.edu.demo.editorial;

import java.awt.geom.Area;
import java.util.List;



public class Contrato {

	
	private String numero;
	private Trabajador trabajador;
	private List<Area> area;
	
	
	@Override
	public String toString() {
		return "Contrato [numero=" + numero + ", trabajador=" + trabajador + ", area=" + area + "]";
	}
	//set y get
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	public List<Area> getArea() {
		return area;
	}
	public void setArea(List<Area> area) {
		this.area = area;
	}
	
	
}
