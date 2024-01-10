import java.util.Scanner;

public class Ex02CalcBhaskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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

		sc.close();
	}

}
