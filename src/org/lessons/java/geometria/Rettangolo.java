package org.lessons.java.geometria;

public class Rettangolo {
	public boolean build;
	public int altezza;
	public int base;
	
	public Rettangolo() {

	}
	
	public Rettangolo(int altezza, int base) {
		this();
		
		this.base = base;
		this.altezza = altezza;
	}
	
	public int getArea() {
		return base * altezza;
	}
	
	public int getPerimetro() {
		return (base + altezza) * 2;
	}
	
	public String toString() {
		String strObj = "base " + base +
						   "\n altezza " + altezza +
						   "\narea " + getArea() +
						   "\nperimetro " + getPerimetro();
		return strObj;		
	}
}
