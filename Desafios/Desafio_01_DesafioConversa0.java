package Desafios;

import java.util.Scanner;

public class Desafio_01_DesafioConversa0 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite seu ultimo salario");
		String n1 = entrada.nextLine().replace(",", ".");

		System.out.println("digite seu penultimo salario");
		String n2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("digite seu antipenultimo salario");
		String n3 = entrada.nextLine().replace(",", ".");
		
		 Double Salario1 = Double.parseDouble(n1);
		 Double Salario2 = Double.parseDouble(n2);
		 Double Salario3 = Double.parseDouble(n3);
		 
		 Double media = (Salario1 + Salario2 + Salario3)/3;
		  System.out.println("A m�dia do seus tr�s ultimos salarios �: "+ media);
		//Desafio � fazer um programa que leia 3 salarios usando o scanner, subistituir o "," por "."
		//e depois fazer a m�dia.
		entrada.close();
	}

}
