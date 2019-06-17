package it.polito.tdp.borders.model;

public class Country implements Comparable<Country>{
	int cod;
	String abbreviazione;
	String nome;
	int grado;
	
	public Country(int cod, String abbreviazione, String nome) {
		this.cod = cod;
		this.abbreviazione = abbreviazione;
		this.nome = nome;
		grado=0;
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

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}
	
	public int compareTo(Country c) {
		return c.getGrado() - this.grado;
	}

	@Override
	public String toString() {
		return "Country [nome=" + nome + "]";
	}
	
	
}
