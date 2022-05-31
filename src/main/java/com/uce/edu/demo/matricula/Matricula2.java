package com.uce.edu.demo.matricula;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	public class Matricula2 {

		private LocalDateTime fechaMatricula;
		
		//3)DI por  metodo set
		private Estudiante estudiante;
		private Materia materia;
			
			public String matricular(LocalDateTime fechaMatricula,String nombreEstudiante,
					String apellidoEstudiante,LocalDateTime fechaNacimiento, String nombreMateria,int semestre) {
			
				this.estudiante.setNombre(nombreEstudiante);
				this.estudiante.setApellido(apellidoEstudiante);
				this.estudiante.setFechaNacimiento(fechaNacimiento);
				
				this.materia.setNombreMateria(nombreMateria);
				this.materia.setSemestre(semestre);
				
				this.fechaMatricula=fechaMatricula;
				return "matriculado por metodo SET";
				
			}
			
			//SET y GET
			
			public Estudiante getEstudiante() {
				return estudiante;
			}
			@Autowired
			public void setEstudiante(Estudiante estudiante) {
				this.estudiante = estudiante;
			}
			public Materia getMateria() {
				return materia;
			}
			@Autowired
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
