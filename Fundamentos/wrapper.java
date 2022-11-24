package Fundamentos;

public class wrapper {
	public static void main(String[] args) {
		//byte
		Byte b = 100;
		Short s = 1000;
		//Diferença é a letra inicial, que no caso é maiuscula.
		
		
		
		Integer i = 1000;
		Long l = 10000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.578;
		System.out.println(d);
		
		//Criando um boleano, deixando ele como true, transformando ele em uma string, deixando ele em caixa alta
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';//char
		System.out.println(c +"....");
		
		
	}
}
