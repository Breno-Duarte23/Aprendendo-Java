package ex08Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		double mediaPares;
		int somaPares = 0;
		int pares = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0){
				somaPares += numeros[i];
				pares ++;
			}
		}
		
		mediaPares = somaPares / pares;
		
		if(somaPares > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}
}
