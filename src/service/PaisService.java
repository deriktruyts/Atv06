package service;

import java.util.List;

import dao.PaisDAO;
import model.Pais;

public class PaisService {
	
	public List <Pais> listar (){
		return dao.listar();
	}
	private PaisDAO dao;
	
	public PaisService() {
		dao = new PaisDAO();
	}
	
	public int incluir(Pais pais) {
		return dao.incluir(pais);
	}
	
	public void atualizar(Pais pais) {
		dao.atualizar(pais);
	}
	
	public void excluir(Pais pais) {
		dao.excluir(pais);
	}
	
	public void excluir(int id) {
		dao.excluir(new Pais(id));
	}
	
	public Pais carregar(Pais pais) {
		return dao.carregar(pais);
	}
	
	public Pais carregar(int id) {
		return dao.carregar(new Pais(id));
	}
}
