package it.polito.tdp.borders.model;

public class Border {
	int c1;
	int c2;
	int anno;
	
	public Border(int c1, int c2, int anno) {
		this.c1 = c1;
		this.c2 = c2;
		this.anno=anno;
	}

	public int getC1() {
		return c1;
	}

	public void setC1(int c1) {
		this.c1 = c1;
	}

	public int getC2() {
		return c2;
	}

	public void setC2(int c2) {
		this.c2 = c2;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	
	
}
