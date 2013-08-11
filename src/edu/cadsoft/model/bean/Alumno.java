package edu.cadsoft.model.bean;

public class Alumno {
	private int id;
	private String apePatAlumno;
	private String apeMatAlumno;
	private String nombresAlumno;
	
	
	public Alumno() {
		super();
	}

	public Alumno(int id, String apePatAlumno, String apeMatAlumno,
			String nombresAlumno) {
		super();
		this.id = id;
		this.apePatAlumno = apePatAlumno;
		this.apeMatAlumno = apeMatAlumno;
		this.nombresAlumno = nombresAlumno;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApePatAlumno() {
		return apePatAlumno;
	}
	public void setApePatAlumno(String apePatAlumno) {
		this.apePatAlumno = apePatAlumno;
	}
	public String getApeMatAlumno() {
		return apeMatAlumno;
	}
	public void setApeMatAlumno(String apeMatAlumno) {
		this.apeMatAlumno = apeMatAlumno;
	}
	public String getNombresAlumno() {
		return nombresAlumno;
	}
	public void setNombresAlumno(String nombresAlumno) {
		this.nombresAlumno = nombresAlumno;
	}
	
	
}
