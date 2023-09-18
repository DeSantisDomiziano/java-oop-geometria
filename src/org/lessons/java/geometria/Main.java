package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Rettangolo ret1 = new Rettangolo();
		Rettangolo ret2 = new Rettangolo();
		Rettangolo ret3 = new Rettangolo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci qui base del primo rettangolo: ");
		ret1.base = sc.nextInt();
		System.out.println("inserisci qui l'altezza del primo rettangolo: ");
		ret1.altezza = sc.nextInt();
		
		ret1.getArea();
		ret1.getPerimetro();
		System.out.println(ret1.toString());
		
		
		System.out.println("inserisci qui l'altezza del secondo rettangolo: ");
		ret2.altezza = sc.nextInt();
		System.out.println("inserisci qui base del secondo rettangolo: ");
		ret2.base = sc.nextInt();
		
		ret2.getArea();
		ret2.getPerimetro();
		
		
		System.out.println("inserisci qui l'altezza del terzo rettangolo: ");
		ret3.altezza = sc.nextInt(); 
		System.out.println("inserisci qui base del terzo rettangolo: ");
		ret3.base = sc.nextInt();
		
		ret3.getArea();
		ret3.getPerimetro();
		
		sc.close();
	}
}
