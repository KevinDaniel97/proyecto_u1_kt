package com.uce.edu.demo.matricula;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Matricula {

	private LocalDateTime fechaMatricula;
	private Estudiante estudiante;
	private Materia materia;

	//2) Por Constructor
		public Matricula(Estudiante estudiante, Materia materia) {
			this.estudiante=estudiante;
			this.materia=materia;
		}
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
			return "matriculado por atributo";
			
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
