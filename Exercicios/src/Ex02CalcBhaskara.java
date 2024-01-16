import java.util.Locale;
import java.util.Scanner;

public class Ex02CalcBhaskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

/*		
 		//Bhaskara
		int a, b, c;
		Double x1, x2, delta;

		System.out.println("Digite o A da expressão");
		a = sc.nextInt();
		System.out.println("Digite o B da expressão");
		b = sc.nextInt();
		System.out.println("Digite o C da expressão");
		c = sc.nextInt();

		delta = (Math.pow(b, 2)) - 4 * a * c;

		if (delta < 0) {
			System.out.println("A equação não possui raízes reais.");
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.printf("A raiz de x1 é: %.2f %n", x1);
			System.out.printf("A raiz de x2 é: %.2f %n", x2);
		}

		//Ex 01 Nelio:
		int numero1, numero2, resultado;
		System.out.println("Digite um número inteiro ");
		numero1 = sc.nextInt();
		System.out.println("Digite mais um número inteiro ");
		numero2 = sc.nextInt();
		resultado = numero1 + numero2;
		System.out.printf("A soma entre %d e %d e igual a %d", numero1, numero2, resultado);
		
		//Ex 02 Nelio:
		double pi, raio, area;
		pi = 3.14159;
		System.out.println("Digite o raio do círculo");
		raio = sc.nextDouble();
		area = pi * (Math.pow(raio, 2));
		System.out.printf("A area de um circulo com raio de %.4f é igual a %.4f", raio, area);

	
		//Ex 03 Nelio:
		int a, b, c, d, resultado;
		System.out.println("Digite um valor inteiro");
		a = sc.nextInt();
		System.out.println("Digite mais um valor inteiro");
		b = sc.nextInt();
		System.out.println("Digite mais um valor inteiro");
		c = sc.nextInt();
		System.out.println("Digite mais um valor inteiro");
		d = sc.nextInt();
		resultado = (a * b) - (c * d);
		System.out.printf("O resultado da diferença entre o produto de %d e %d pelo produto de %d e %d é igual a %d", a, b, c, d, resultado);

		
		//Ex 04 Nelio:
		int numFuncionario, hrsTrabalhadas;
		double valorPorHora, salario;
		System.out.println("Digite o seu número: ");
		numFuncionario = sc.nextInt();
		System.out.println("Digite quantas horas voce trabalhou: ");
		hrsTrabalhadas = sc.nextInt();
		System.out.println("Digite quanto você recebe por hora: ");
		Locale.setDefault(Locale.US);
		valorPorHora = sc.nextDouble();
		salario = hrsTrabalhadas * valorPorHora;
		System.out.printf("O valor do salário do ID- %d é U$%.2f. ", numFuncionario, salario);
		
		//Ex 05 Nelio:
		int codigoPeca1, codigoPeca2, qtdPeca1, qtdPeca2;
		double valorPeca1, valorPeca2, totalPagar;
		System.out.println("Digite o ID, a quantidade e o valor da peça 1");
		codigoPeca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		System.out.println("Digite o ID, a quantidade e o valor da peça ");
		codigoPeca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		totalPagar = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);
		System.out.printf("VALOR A PAGAR: R$%.2f", totalPagar);
*/
		//Ex 06 Nelio:
		double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi;
		pi = 3.14159;
		System.out.println("Digite 3 numeros: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		areaTriangulo = (a * c) / 2;
		areaCirculo = pi * Math.pow(c, 2);
		areaTrapezio = ((a + b) * c) / 2;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a * b;
		System.out.printf("TRIANGULO: %.3f %n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f %n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f %n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f %n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f %n", areaRetangulo);
		sc.close();
	}

}
