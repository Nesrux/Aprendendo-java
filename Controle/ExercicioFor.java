package Controle;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite sair para cancelar o loop");
		
		String i = "";
		while(!i.equalsIgnoreCase("sair")) {
			System.out.println("Voce diz:");
			i  = entrada.next();
	}
	
		
	entrada.close();
}
}