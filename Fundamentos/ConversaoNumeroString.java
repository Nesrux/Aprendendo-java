package Fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());//transformou em string dps contou quantos caracteres
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());//mesma coisa de forma diferente.
		
		
		System.out.println((""+ num2).length());//fez a mesma coisa de formas diferença, nesse caso uma concatenação de tring com numero da uma string.
		
	}

}
