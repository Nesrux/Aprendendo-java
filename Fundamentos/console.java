package Fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite seu nome");
		String nome =entrada.nextLine();
		System.out.println("Digite seu sobrenome");
		String sobrenome =entrada.nextLine();
		System.out.println("Digite sua idade");
		int idade =entrada.nextInt();
		
		System.out.printf("%s %s você tem %d anos", nome, sobrenome, idade);
		
		
		
		entrada.close();
	}
}
