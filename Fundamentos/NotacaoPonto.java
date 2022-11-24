package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "bom dia X";
		s = s.replace("X", "bom dia");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "leo".toUpperCase();
		System.out.println(x);
		
		String y ="Bom dia"
				.replace("dia", "garoto")
				.toUpperCase()
				.concat("AAAAAAAAAAAAAAAAAAAAAAAAAA");
		System.out.println(y);
		
		//tipos primitivos não tem operador .
		int a = 3;
		System.out.println(a);
	
	}
		
		}
