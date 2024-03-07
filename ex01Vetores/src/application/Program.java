package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite quantos números você deseja digitar: ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos: ");
		
		for (int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
		
		sc.close();
	}
}
