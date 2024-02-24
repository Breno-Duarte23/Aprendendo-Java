import java.util.Scanner;
import java.util.Locale;

public class Ex03EstruturaCondicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
/*
		// Ex 01 Nelio:
		int numPositivo;
		System.out.println("Digite um número inteiro");
		numPositivo = sc.nextInt();

		if (numPositivo > 0) {
			System.out.println("O numero é positivo!");
		} else {
			System.out.println("O numero é negativo!");
		}

		// Ex 02 Nelio:
		int numPar;
		System.out.println("Digite um número inteiro");
		numPar = sc.nextInt();
		if (numPar % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}

		// Ex 03 Nelio:
		int num1, num2;
		System.out.println("Digite 2 valores inteiros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num2 % num1 == 0) {
			System.out.println("São múltiplos");
		} else if (num1 % num2 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		// Ex 04 Nelio:

		System.out.println("Digite a hora do início e do fim do jogo: ");
		int horaInicio = sc.nextInt();
		int horaTermino = sc.nextInt();
		int duracao;

		if (horaInicio < horaTermino) {
			duracao = horaTermino - horaInicio;
		} else {
			duracao = 24 - horaInicio + horaTermino;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		// Ex 05 Nelio:
		int quantidade, idDigitado;
		double valorTotal = 0;

		System.out.println("Digite o id do item e a quantidade");
		idDigitado = sc.nextInt();
		quantidade = sc.nextInt();

		if (idDigitado == 1) {
			valorTotal = quantidade * 4.00;
		} 
		else if (idDigitado == 2) {
			valorTotal = quantidade * 4.5;
		} 
		else if (idDigitado == 3) {
			valorTotal = quantidade * 5.00;
		} 
		else if (idDigitado == 4) {
			valorTotal = quantidade * 2.00;
		} 
		else if (idDigitado == 5) {
			valorTotal = quantidade * 1.50;
		} 
		else {
			System.out.println("Produto Inválido");
		}
		System.out.printf("Total: %.2f", valorTotal);

		// Ex 06 Nelio:
		System.out.println("Digite um valor de 0 até 100");
		double valorUsuario = sc.nextDouble(); 
		if(valorUsuario >= 0 && valorUsuario <= 25.0) {
			System.out.println("Intervalo (0, 25)");
		}
		else if(valorUsuario > 25.00 || valorUsuario <= 50.0){
			System.out.println("Intervalo (25, 50)");
		}
		else if(valorUsuario > 50 || valorUsuario <= 75.0){
			System.out.println("Intervalo (50, 75)");
		}
		else if(valorUsuario > 75 || valorUsuario <= 100.0){
			System.out.println("Intervalo (75, 100)");
		} 
		else {
			System.out.println("Valor fora do intervalo");
		}

		// Ex 07 Nelio:
		System.out.println("Digite x e y");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if(x == 0) {
			System.out.println("Eixo X");
		}
		else if(y == 0) {
			System.out.println("Eixo y");
		} 
		else if(x < 0 && y <0){
			System.out.println("Q2");
		}
		else if(x > 0 && y > 0){
			System.out.println("Q1");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		// Ex 08 Nelio:
		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
*/
		sc.close();
	}

}
