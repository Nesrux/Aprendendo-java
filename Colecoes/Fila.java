package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		//Offer e add -> adicionam elementos na fila
		//A diferença é o comportamento quando a fila está Cheia!
		
		fila.add("Ana");
		fila.offer("bia");
		fila.offer("Cleitinho");
		fila.offer("Gl");
		fila.offer("Mauricio");
		fila.offer("LA'Ele");
		
		//Peek e element -> obtem o próximo elemento da fila sem remover
		//A diferença é o comportamento quando a fila está  Vazia
		System.out.println(fila.peek());//Se a fila estiver vazia ele retorna NULL
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//isEmpty() verifica se a fila está vazia
		//.clear() Esvazia a fila
		//Retorna o tamanho da fila em Int
 		
		if(!fila.isEmpty()) {
			System.out.println("Tem gente");
		}else {
			System.out.println("não tem gente");
		}
		//.pool() -> retorna o primeiro elemento da fila mas removendo ele da fila
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
