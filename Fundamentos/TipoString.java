package Fundamentos;

public class TipoString {
 public static void main(String[] args) {
	System.out.println("ol� pessoal");
	
	String s = "boa tarde";
	System.out.println(s.concat("!!!"));
	
	System.out.println(s+ "!!!");
	
	System.out.println(s.startsWith("Boa"));//Come�a com!
	
	System.out.println(s.toLowerCase().startsWith("BOA"));
	
	System.out.println(s.toUpperCase().endsWith("TARDE"));
	
	System.out.println(s.length());
	
	var nome = "jaum";
	var sobreNome = "Marcos";
	var idade = 21;
	var salario = 5000.50;
	
	
	System.out.printf("Ol� %s",nome, salario, idade, sobreNome);
}
}
