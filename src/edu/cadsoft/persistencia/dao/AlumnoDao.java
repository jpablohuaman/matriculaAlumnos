package edu.cadsoft.persistencia.dao;

import java.util.List;

import edu.cadsoft.model.bean.Alumno;

public interface AlumnoDao {
	List<Alumno> listarAlumnos();
	boolean registrarAlumno(Alumno alumno);
}
