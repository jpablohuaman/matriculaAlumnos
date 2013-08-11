package edu.cadsoft.service;

import java.util.List;

import edu.cadsoft.model.bean.Alumno;

public interface Servicio {
	List<Alumno> mostrarTotAlumnos();
	boolean agregarAlumnos(Alumno alumno);
}
