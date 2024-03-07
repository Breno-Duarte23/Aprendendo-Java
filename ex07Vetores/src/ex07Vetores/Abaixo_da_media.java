package ex07Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double somaVetor = 0;
		double mediaVetor = 0;
		
		double[] numeros = new double[n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}  
		
		for(int i = 0; i < numeros.length; i++) {
			somaVetor = somaVetor + numeros[i];
		}  
		
		mediaVetor = somaVetor / numeros.length;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", mediaVetor);
		System.out.printf("ELEMENTOS ABAIXO DA MEDIA: \n");
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] < mediaVetor) {
				System.out.printf("%.1f\n", numeros[i]);
			}
		}  
		
		sc.close();
	}
}
