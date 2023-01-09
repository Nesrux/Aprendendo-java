package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		//Funciona que nem uma pilha de objetos
		//O primeiro a entrar é o ultimo é a sair.
		//Famigerado FIFO (first in / first out)
		Deque<String> livros = new ArrayDeque<>();
		livros.add("Meórias postumas de brás cubas");
		livros.push("Eu, lima maria");
		livros.add("RezendeEvil, um mundo 2 heróis");
		

		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
	}
}
