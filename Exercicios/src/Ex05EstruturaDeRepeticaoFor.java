import java.util.Scanner;
import java.util.Locale;

public class Ex05EstruturaDeRepeticaoFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
/*
 		//Ex01
		int x = sc.nextInt();
		if (x < 1 || x > 1000) {
			System.out.println("Digite um valor entre 1 e 1000");
			x = sc.nextInt();
		}
		
		for(int i = 1; i <= x; i+=2) {
			System.out.println(i);
		}

		//Ex 02
		int qtdIn = 0, qtdOut = 0, numero = 0;
		System.out.println("Quantos números irá informar?");
		int qtdNum = sc.nextInt();
		
		for(int i = 0; i < qtdNum; i++) {
			numero = sc.nextInt();
			if(numero >= 10 && numero <= 20) {
				qtdIn+=1;
			}
			else {
				qtdOut+=1;
			}
		}
		System.out.println(qtdIn + " in");
		System.out.println(qtdOut + " out");
		
		//Ex03
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		//Ex 04
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int numerador = sc.nextInt();
			int denominador = sc.nextInt();
			if(denominador == 0) {
				System.out.println("Divisão impossível");
			} 
			else {
				double resultado = (double) numerador / denominador;
				System.out.printf("%.1f", resultado);
			}
		}
		
		// Ex 05
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);

		
		//Ex 06
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0){
				System.out.println(i);
			}
		}
		
		
		// Ex 07
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
*/	
		sc.close();
	}

}
