package Desafios;

import java.util.Scanner;

public class DesafioCalc {
	public static void main(String[] args) {
		//Desafio é criar uma calculadora apenas com as coisas que foram incinadas até aqui
		// o usuario deve digitar 2 números e depois ele pode escolher se vai fazer uma soma
		//divisao multiplicação e subtração sem usar
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o primeiro número");
		double n1  =  entrada.nextDouble();
		
		System.out.println("digite o segundo número número");
		double n2  = entrada.nextDouble();
		
		System.out.println("Digite a operação que voce Quer Fazer, apenas Digitando +, -, * ou /");
		String opercao = entrada.next();
		
		
		//logica
		double result = "+".equals(opercao) ? n1 + n2 : 0;
		result = "-".equals(opercao) ? n1 - n2 : result;
		result = "*".equals(opercao) ? n1 * n2 : result;
		result = "/".equals(opercao) ? n1 / n2 : result;
		
		System.out.printf("%.2f %s %.2f = %.2f", n1, opercao, n2, result);
	
		
		entrada.close();
		
		
		
	}

}
