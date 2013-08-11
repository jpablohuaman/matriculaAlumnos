package edu.cadsoft.service.impl;

import java.util.List;


import edu.cadsoft.model.bean.Alumno;
import edu.cadsoft.persistencia.dao.AlumnoDao;
import edu.cadsoft.persistencia.dao.impl.AlumnoDaoImpl;
import edu.cadsoft.service.Servicio;

public class ServiceImpl implements Servicio{
	private AlumnoDao aluDao;
	
	public ServiceImpl() {	
		aluDao = new AlumnoDaoImpl();
	}

	public boolean agregarAlumnos(Alumno alu) {
		return aluDao.registrarAlumno(alu);
	}

	@Override
	public List<Alumno> mostrarTotAlumnos() {
		return aluDao.listarAlumnos();
	}

}
