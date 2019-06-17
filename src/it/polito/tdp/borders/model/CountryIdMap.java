package it.polito.tdp.borders.model;

import java.util.HashMap;
import java.util.Map;

public class CountryIdMap {
	Map<Integer,Country> map = new HashMap<Integer,Country>();
	
	public CountryIdMap() {
		
	}
	
	public Country add(Country c) {
		if(!map.containsValue(c)) {
			map.put(c.getCod(), c);
			return c;
		}
		else
			return c;
	}
	
	public Country get(int id) {
		return map.get(id);
	}
	
	
}
