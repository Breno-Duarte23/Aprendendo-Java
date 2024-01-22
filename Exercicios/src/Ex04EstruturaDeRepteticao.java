import java.util.Scanner;

public class Ex04EstruturaDeRepteticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
/*
 		//Ex 01 
		int senha = 2002;
		int tentativa = 0;
		
		System.out.println("Digite a senha: ");
		tentativa = sc.nextInt();
		
		while (tentativa != senha) {
			System.out.println("Senha incorreta!");
			System.out.println("Digite novamente a senha: ");
			tentativa = sc.nextInt();
		}
		System.out.println("Acesso permitido!");

		//Ex 01 
		int x = 0, y = 0;
		
		System.out.println("Digite duas coordenadas de x e y:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			} 
			else if(x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			} 
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			} 
			else {
				System.out.println("Quarto quadrante");
			}
			System.out.println("Digite outras duas coordenadas de x e y:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
*/
		// Ex 03
		int codigoInformado = 0, contadorAlcool = 0, contadorGasolina = 0, contadorDiesel = 0;
		
		while (codigoInformado != 4) {
			System.out.println("Digite o código do seu combustível favorito, sendo eles: ");
			System.out.println("1- Alcool");
			System.out.println("2- Gasolina");
			System.out.println("3- Diesel");
			System.out.println("4- Sair");
			codigoInformado = sc.nextInt();
			switch (codigoInformado){
			case 1: 
				contadorAlcool += 1;
				break;
			case 2:
				contadorGasolina +=1;
				break;
			case 3: 
				contadorDiesel +=1;
				break;
			case 4:
				codigoInformado = 4;
				break;
			default:
				while (codigoInformado != 4 && codigoInformado != 3 && codigoInformado!=2 && codigoInformado != 1) {
					System.out.println("Digite um valor Válido");
					System.out.println("1- Alcool");
					System.out.println("2- Gasolina");
					System.out.println("3- Diesel");
					System.out.println("4- Sair");
					codigoInformado = sc.nextInt();
					
					if (codigoInformado == 1) {
						contadorAlcool += 1;
					}
					else if (codigoInformado == 2) {
						contadorGasolina += 1;
					}
					else if (codigoInformado == 3) {
						contadorDiesel +=1;
					} 
					else if(codigoInformado == 4) {
						break;
					}
					else {
						codigoInformado = 5;
					}
				}
				break;
			}
		}
		System.out.println("MUITO OBRIGADO ");
		System.out.println("Alcool: " + contadorAlcool);
		System.out.println("Gasolina: " + contadorGasolina);
		System.out.println("Diesel: " + contadorDiesel);
		
		sc.close();
	}

}
