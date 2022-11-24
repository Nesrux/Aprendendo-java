package Controle;

import java.util.Scanner;

public class IfElseIf {
public static void main(String[] args) {
	
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite sua nota");
	double n1 = entrada.nextDouble();
	if(n1 > 10 || n1 < 0) {
		System.out.println("nota invalida!");
	}else if(n1 >= 8.1) {
		System.out.println("Conceito A");
	}else if(n1 >= 6.1) {
		System.out.println("Conceito B");
	}else if (n1 >= 5){
		System.out.println("conceito C");
	} else if(n1 >= 3) {
		System.out.println("conceito D");
	} else if(n1 >= 0) {
		System.out.println("conceito F");
	}
	
	entrada.close();
	
}
}
