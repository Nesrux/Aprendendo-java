package Controle;

import java.util.Scanner;

public class DesafioSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o dia da semana"
				+ " 1 para domingo 2 para segunda e assim por diante");
		int dia = entrada.nextInt();
		if(dia == 1) {
			System.out.println("hoje � Domingo");
		}else if(dia == 2) {
			System.out.println("hoje � Segunda");
		}else if(dia == 3) {
			System.out.println("hoje � Terca");
		}else if(dia == 4) {
			System.out.println("hoje � Quarta");
		}else if(dia == 5) {
			System.out.println("hoje � Quinta");
		}else if(dia == 6) {
			System.out.println("hoje � Sexta");
		}else if(dia == 7) {
			System.out.println("hoje � Sabado");
		}else {
			System.out.println("n�mero invalido");
		}
		
		
		entrada.close();
	}

}
