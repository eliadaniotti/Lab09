package it.polito.tdp.borders.model;

import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.borders.db.BordersDAO;

public class Model {

	BordersDAO b = new BordersDAO();
	SimpleGraph<Country, DefaultEdge> grafo;
	List<Country> countries = new LinkedList<Country>();
	List<Border> borders = new LinkedList<Border>();
	
	public Model() {
		//grafo = new SimpleGraph<Country, DefaultEdge>(DefaultEdge.class);
		countries.addAll(b.loadAllCountries());
	}
	
	public void creaGrafo(int anno) {
		grafo = new SimpleGraph<Country, DefaultEdge>(DefaultEdge.class);
		
		borders.removeAll(borders);
		borders.addAll(b.getCountryPairs(anno));
		
		for(Country c : countries)
			c.setGrado(0);
	
		for (Border b : borders) {
			grafo.addVertex(b.getC1());
			grafo.addVertex(b.getC2());
			grafo.addEdge(b.getC1(), b.getC2());
		}
		
		
		for(Country co : countries)
			co.setGrado(grafo.degreeOf(co));
		
		Collections.sort(countries);
	}
	
	public List<Country> getAllCountries() {
		return countries;
	}
	
	public List<Border> getAllBorders(int anno){
		return borders;
	}
	
	

}
