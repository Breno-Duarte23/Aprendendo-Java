import java.util.Scanner;
import java.util.Locale;

public class Ex03EstruturaCondicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

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

		sc.close();
	}

}
