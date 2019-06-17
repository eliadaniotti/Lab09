package it.polito.tdp.borders.model;

public class Country {
	String cod;
	String abbreviazione;
	String nome;
	
	public Country(String cod, String abbreviazione, String nome) {
		this.cod = cod;
		this.abbreviazione = abbreviazione;
		this.nome = nome;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
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
