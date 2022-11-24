package Controle;

import java.util.Scanner;

public class SwichComBreak {
	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		System.out.println("digite sua nota");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 1:
			System.out.println("Repetente");
			break;
		case 2:
			System.out.println("Repetente");
			break;
		
		case 3:
			System.out.println("Repetente");
			break;
		
		case 4:
			System.out.println("Recuperacao");
			break;
		case 5:
			System.out.println("Recuperacao");
			break;
		case 6:
			System.out.println("Recuperacao");
			break;
		case 7:
			System.out.println("Passou De ano");
			break;
		case 8:
			System.out.println("Passou De ano");
			break;
		case 9:
			System.out.println("Passou De ano");
			break;
		case 10:
			System.out.println("Passou De ano");
			break;
		
		}
		
		entrada.close();
	}

}
