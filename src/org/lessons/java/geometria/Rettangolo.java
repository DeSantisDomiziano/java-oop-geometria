package org.lessons.java.geometria;

public class Rettangolo {
	
	public boolean build;
	public int altezza;
	public int base;
	
	public Rettangolo() {
		build = false;
	}
	
	public Rettangolo(int altezza, int base) {
		this();
		
		this.base = base;
		this.altezza = altezza;
	}
	
	public int getArea(int base, int altezza) {
		
		int area = this.base * this.altezza;
		return area;
	}
	
	public int getPerimetro() {
		int perimetro = (2 * this.base) + (2 * this.altezza);
		return perimetro;
	}
}
