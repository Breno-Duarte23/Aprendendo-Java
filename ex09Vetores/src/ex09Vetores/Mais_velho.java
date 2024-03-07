package ex09Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades =  new int[n];
		int maisVelho = 0;
		int posicaoMaisVelho = 0;
		 
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(idades[i] > maisVelho) {
				maisVelho = idades[i];
				posicaoMaisVelho = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s ", nomes[posicaoMaisVelho]);
		
		sc.close();
	}
}
