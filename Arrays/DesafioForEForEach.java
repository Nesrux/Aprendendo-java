package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioForEForEach {
	public static void main(String[] args) {
		//Crie um programa que utilizando o for e/ou o foEach onde o usuario possa inserir a quantidades de dados que ele vai colocar
		//E depois todas as notas que ele colocar em uma array
		//depois faça a média dessa soma, e mostre para o usuario.
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas você quer colocar ?");
		
		int qtDeNotas = entrada.nextInt();
		
		double[] notas = new double[qtDeNotas];
		for (int i = 0; i <notas.length; i++) {
			System.out.println("Informe a Nota " + (i + 1) + ": ");
			notas[i] = entrada.nextInt();
		}
		System.out.println(Arrays.toString(notas));
		double total = 0;
		
		for(double nota: notas) {
			total += nota / notas.length;
		}
		System.out.println("A média é" + total);
		
		entrada.close();
	}
}
