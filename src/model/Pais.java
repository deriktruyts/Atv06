package model;

import java.io.Serializable;

public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private String populacao;
	private String area;
	
	public Pais(int id) {
		this.id = id;
	}
	
	public Pais(int id, String nome, String populacao, String area) {
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}

	public Pais() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPopulacao() {
		return populacao;
	}

	public void setPopulacao(String populacao) {
		this.populacao = populacao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", populacao= " + populacao + ", area=" + area + "]";
	}

}
