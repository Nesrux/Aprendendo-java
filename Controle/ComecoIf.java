package Controle;

import java.util.Scanner;

public class ComecoIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua nota");
		double n1 = entrada.nextDouble();
		if(n1 <= 10 && n1 > 7) {
			System.out.println("voce passou");
		}
		
		if(n1 >= 6 && n1 <= 4.5) {
			System.out.println("tá na recuperação meu parça");
		}
		else {
			System.out.println("você não passou!");
		}
		entrada.close();
	}
}
