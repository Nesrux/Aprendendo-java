package Desafios;

import java.util.Scanner;

public class DesafioCalc {
	public static void main(String[] args) {
		//Desafio � criar uma calculadora apenas com as coisas que foram incinadas at� aqui
		// o usuario deve digitar 2 n�meros e depois ele pode escolher se vai fazer uma soma
		//divisao multiplica��o e subtra��o sem usar
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o primeiro n�mero");
		double n1  =  entrada.nextDouble();
		
		System.out.println("digite o segundo n�mero n�mero");
		double n2  = entrada.nextDouble();
		
		System.out.println("Digite a opera��o que voce Quer Fazer, apenas Digitando +, -, * ou /");
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
