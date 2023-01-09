package Colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
	
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Joao");
		Usuario u2 = new Usuario("Marcos");
		Usuario u3 = new Usuario("Thais");
	
		lista.add(u1);
		lista.add(u2);
		lista.add(u3);
		lista.add(new Usuario("lia"));
		lista.add(new Usuario("manu"));
		lista.add(new Usuario("jacinto"));
		
		System.out.println(lista.remove(new Usuario("lia")));//Por causa do hashCode e do equals , o usuario pode ser removido adicionando um obejeto igual ao que eu quero excluit; 
		System.out.println(">>>>" + lista.remove(0));
		for(Usuario user: lista) {
			System.out.println(user);
		}
		System.out.println(lista.get(3));//Acessar pelo index
		
	}
}