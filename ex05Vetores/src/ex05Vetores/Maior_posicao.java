package ex05Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros você vai digitar? ");
		
		int n =sc.nextInt();
		int posicaoMaior = 0;
		double[] numeros = new double[n];
		double maiorValor = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maiorValor) {
				maiorValor = numeros[i];
				posicaoMaior = i;
			}
		}
		
		
		System.out.printf("\nMAIOR VALOR = %.2f", maiorValor);
		System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", posicaoMaior);
		sc.close();
	}
}
