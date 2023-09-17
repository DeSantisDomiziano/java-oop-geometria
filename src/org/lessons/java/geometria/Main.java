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
		
		for(int i = 0; i < ret1.base; i++) {
			
		}
		
		ret1.getArea(ret1.base, ret1.altezza);
		ret1.getPerimetro(ret1.base, ret1.altezza);
		
		
		System.out.println("inserisci qui l'altezza del secondo rettangolo: ");
		ret2.altezza = sc.nextInt();
		System.out.println("inserisci qui base del secondo rettangolo: ");
		ret2.base = sc.nextInt();
		
		ret2.getArea(ret2.base, ret2.altezza);
		ret2.getPerimetro(ret2.base, ret2.altezza);
		
		
		System.out.println("inserisci qui l'altezza del terzo rettangolo: ");
		ret3.altezza = sc.nextInt(); 
		System.out.println("inserisci qui base del terzo rettangolo: ");
		ret3.base = sc.nextInt();
		
		ret3.getArea(ret3.base, ret3.altezza);
		ret3.getPerimetro(ret3.base, ret3.altezza);
		
		
		
		
		
	}
}
