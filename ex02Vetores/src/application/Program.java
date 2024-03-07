package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma, media;
		int n;
		
		System.out.print("Quantos números irá digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número");
			vetor[i] = sc.nextDouble();
		}
		
		soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		media = soma / vetor.length;
		
		System.out.print("\nVALORES = ");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		System.out.printf("\nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();
	}
}
