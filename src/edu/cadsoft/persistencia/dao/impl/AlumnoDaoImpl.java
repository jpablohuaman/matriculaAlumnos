package edu.cadsoft.persistencia.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;

import edu.cadsoft.model.bean.Alumno;
import edu.cadsoft.persistencia.coneccion.Coneccion;
import edu.cadsoft.persistencia.dao.AlumnoDao;

public class AlumnoDaoImpl implements AlumnoDao {

	
	public List<Alumno> listarAlumnos(){
		Connection con= (Connection) Coneccion.getInstance().obtenerConeccion();
		List<Alumno> listAlumno=null;
		try {
			
			Statement stm=con.createStatement();
			String query="select * from Alumno";
			ResultSet rs=stm.executeQuery(query);
			listAlumno=new ArrayList<Alumno>();
			
			
			while(rs.next()){
				Alumno alu=new Alumno(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				listAlumno.add(alu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listAlumno;
	}

	@Override
	public boolean registrarAlumno(Alumno alumno) {
		Connection con= (Connection) Coneccion.getInstance().obtenerConeccion();
		try {
			con.setAutoCommit(false);
			String query="insert into alumno values(?,?,?,?)";
			PreparedStatement psm=con.prepareStatement(query);
			psm.setInt(1,alumno.getId());
			psm.setString(2,alumno.getApePatAlumno());
			psm.setString(3,alumno.getApeMatAlumno());
			psm.setString(4,alumno.getNombresAlumno());
			psm.executeUpdate();
			con.commit();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
