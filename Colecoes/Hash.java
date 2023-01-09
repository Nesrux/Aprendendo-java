package Colecoes;

import java.util.HashSet;

public class Hash {
public static void main(String[] args) {
	HashSet <Usuario> usuarios = new HashSet<>();
	usuarios.add(new Usuario("pedro"));
	usuarios.add(new Usuario("ana"));
	usuarios.add(new Usuario("guilherme"));
	usuarios.add(new Usuario("marcela"));
	
	boolean resultado = usuarios.contains(new Usuario("guilherme")); //Só funcionou por causa do hashcode dentro de usuarios
	System.out.println(resultado);
}
}
