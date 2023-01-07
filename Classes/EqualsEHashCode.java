package Classes;

import java.util.Date;

public class EqualsEHashCode {
	public static void main(String[] args) {
		//Criando objetos apenas para testar o Hashcode e o equals;
		User u1 = new User("joao", "joaomarcosx100");
		User u2 = new User("joao", "joaomarcosx100");
		User u3 = new User("marcelo", "marceloAlmeida@gmail.com");
	
		System.out.println(u1 == u2);//Falso, pois o endereço de memória é diferente
		System.out.println(u1.equals(u2));//False, pois nesse caso o .equals está verificando o  endereço na memória
		//Depois de ter criado o método equals dentro do user.java, agora o .equals vai dar true
		
		System.out.println(u1.equals(u2));//Verdadeiro
		System.out.println(u2.equals(u1));//Verdadeiro
		System.out.println(u3.equals(u1));//Falso
		System.out.println(u1.equals(new Date()));//Falso, pois o método equals nao consegiu dar cast e transformar a DATE em um USER
		
	}

}
