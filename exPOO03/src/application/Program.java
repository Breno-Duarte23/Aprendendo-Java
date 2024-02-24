package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		//utilizando as bibliotecas importadas
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Linkando o programa com o pacote entidades.
		Students student = new Students();
			
		int verify = 0;
		//Recepção de dados	
		System.out.println("Digite o seu nome e as notas dos 3 trimestres");
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		while (verify != 1) {
			if(student.grade1 > 30 || student.grade1 < 0 || student.grade2 > 35 || student.grade2 < 0 || student.grade3 > 35 || student.grade3 < 0) {
				System.out.println("Digite as notas válidas");
				student.grade1 = sc.nextDouble();
				student.grade2 = sc.nextDouble();
				student.grade3 = sc.nextDouble();
			} else {
				verify = 1;
			}
		}
		
		//Saída de dados
		System.out.printf("FINAL GRADE: %.2f \n", student.totalGrade());
		if (student.missingPoints() == 0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		sc.close();
	}

}
