package it.polito.tdp.borders.model;

import java.util.List;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.borders.db.BordersDAO;

public class Model {

	BordersDAO b = new BordersDAO();
	SimpleGraph<Country, Border> grafo = new SimpleGraph<Country, Border>(EdgeFactory<Country,Border>);
	
	public Model() {
	
	}
	
	public List<Country> getAllCountries() {
		return b.loadAllCountries();
	}
	
	public List<Border> getAllBorders(int anno){
		return b.getCountryPairs(anno);
	}

}
