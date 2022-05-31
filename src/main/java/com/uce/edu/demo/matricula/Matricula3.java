package com.uce.edu.demo.matricula;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Matricula3 {

	private LocalDateTime fechaMatricula;
	@Autowired
	private Estudiante estudiante;
	@Autowired
	private Materia materia;

		public String matricular(LocalDateTime fechaMatricula,String nombreEstudiante,
				String apellidoEstudiante,LocalDateTime fechaNacimiento, String nombreMateria,int semestre) {
		
			this.estudiante.setNombre(nombreEstudiante);
			this.estudiante.setApellido(apellidoEstudiante);
			this.estudiante.setFechaNacimiento(fechaNacimiento);
			
			this.materia.setNombreMateria(nombreMateria);
			this.materia.setSemestre(semestre);
			
			//seteamos los atributos de la fecha de matricula
			this.fechaMatricula=fechaMatricula;
			
			//se inserta la cita en la base de datos
			return "matriculado por constructor";
			
		}
		//SET y GET
		
		public Estudiante getEstudiante() {
			return estudiante;
		}
		public void setEstudiante(Estudiante estudiante) {
			this.estudiante = estudiante;
		}
		public Materia getMateria() {
			return materia;
		}
		public void setMateria(Materia materia) {
			this.materia = materia;
		}
		public LocalDateTime getFechaMatricula() {
			return fechaMatricula;
		}
		public void setFechaMatricula(LocalDateTime fechaMatricula) {
			this.fechaMatricula = fechaMatricula;
		}
}
