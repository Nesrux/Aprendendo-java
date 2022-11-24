package Controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("voce precisa Falar as palavras magicas");
			System.out.println("Quer sair");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("sair"));
		
		
		entrada.close();
}
}
