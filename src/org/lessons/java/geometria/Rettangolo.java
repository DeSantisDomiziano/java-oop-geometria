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
		
		int area = base * altezza;
		System.out.println("l'area è: " + area);
		return area;
	}
	
	public int getPerimetro(int base, int altezza) {
		int perimetro = (base + altezza) * 2;
		System.out.println("il perimetro è: " + perimetro);
		return perimetro;
	}
}
