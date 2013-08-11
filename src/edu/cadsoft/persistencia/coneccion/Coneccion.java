package edu.cadsoft.persistencia.coneccion;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class Coneccion {
	private static Coneccion instance;
	
	private Coneccion(){
		
	}
	public static Coneccion getInstance(){
		if(instance==null)	instance=new Coneccion();
			
		return instance;		
	}
	
	public Connection obtenerConeccion(){
		Connection con=null;
		Context ctx=null;
		try {
			
			ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/my-db");
			con = ds.getConnection();
			
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost/cadsoft","root","");
		} catch (ClassNotFoundException e) {
			System.out.println("Error en buscar el driver");
		} catch (SQLException e) {
			System.out.println("Error en la conexion con la base de datos");
		}*/
		return con;
	}
	public static void main(String[] args) {
		/*Coneccion c=new Coneccion();
		c.obtenerConeccion();*/
		Coneccion.getInstance().obtenerConeccion();//Con Singleton, reemplaza lo anterior
	}
	
}
