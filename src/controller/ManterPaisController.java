package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;

@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ManterPaisController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		String pNome = request.getParameter("nome"); 
		String pPopulacao = request.getParameter("populacao"); 
		String pArea = request.getParameter("area"); 
		
		//instanciar o javabean 
		Pais pais = new Pais(); 
		pais.setNome(pNome); 
		pais.setPopulacao(pPopulacao); 
		pais.setArea(pArea); 
		
		//instanciar o service 
		PaisService cs = new PaisService(); 
		cs.incluir(pais); 
		pais = cs.carregar(pais.getId()); 
		
		request.setAttribute("paises", cs.listar()); 
		
		RequestDispatcher rd = request.getRequestDispatcher("paises.jsp"); rd.forward(request, response); 
	}
}

