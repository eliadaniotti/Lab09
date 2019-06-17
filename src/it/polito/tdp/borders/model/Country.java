package it.polito.tdp.borders.model;

public class Country {
	int cod;
	String abbreviazione;
	String nome;
	
	public Country(int cod, String abbreviazione, String nome) {
		this.cod = cod;
		this.abbreviazione = abbreviazione;
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getAbbreviazione() {
		return abbreviazione;
	}

	public void setAbbreviazione(String abbreviazione) {
		this.abbreviazione = abbreviazione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
