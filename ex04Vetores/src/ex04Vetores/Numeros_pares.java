package ex04Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdpares;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] numeros = new int[n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES: ");
		
		qtdpares = 0;
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.printf("%d ", numeros[i]);
				qtdpares++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d", qtdpares);
		sc.close();
	}

}
