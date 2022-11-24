package Fundamentos;

import java.util.Scanner;

public class TipoStringIgual {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String ("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner (System.in);
		String s2 = entrada.nextLine();//.next remove os espaços em branco.
		System.out.println("2" == s2.trim());//.trim remove os espaços
		System.out.println("2".equals(s2.trim()));
		
		
		entrada.close();
		 
	}

}
