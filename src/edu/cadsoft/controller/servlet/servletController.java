package edu.cadsoft.controller.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cadsoft.model.bean.Alumno;
import edu.cadsoft.service.Servicio;
import edu.cadsoft.service.impl.ServiceImpl;

/**
 * Servlet implementation class servletController
 */
public class servletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Servicio service;
    
    
    @Override
    public void init() throws ServletException {
    	service=new ServiceImpl();
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String servletPath=request.getServletPath();
		if(servletPath.equals("/listarAlumnos.cadsoft")){
			List<Alumno> list=service.mostrarTotAlumnos();
			request.getSession().setAttribute("lista",list);
			request.getRequestDispatcher("listarAlumnos.jsp").forward(request, response);
		}
		if(servletPath.equals("/agregarAlumnos.cadsoft")){
			request.getRequestDispatcher("agregarAlumnos.jsp").forward(request, response);
		}
		if(servletPath.equals("/procesarAlumnos.cadsoft")){
			String pat=request.getParameter("txtPaterno");
			String mat=request.getParameter("txtMaterno");
			String nom=request.getParameter("txtNombres");
			Alumno alu=new Alumno();
			alu.setApeMatAlumno(mat);
			alu.setApePatAlumno(pat);
			alu.setNombresAlumno(nom);
			boolean resultado=service.agregarAlumnos(alu);
			if(!resultado)System.out.println("Fallo la consulta");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}


}
