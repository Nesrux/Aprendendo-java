package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//Como as colections nao aceitam tipos primitivos, o hashSet converte todos os tipos primitivos para a versão em objetos
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("teste"); // String
		conjunto.add(1);// int -> Integer
		conjunto.add("x");// Char -> caractere
		
		//Size é igual o .lenth que verifica o tamanho 
		System.out.println("Tamanho é "+ conjunto.size());
		conjunto.add("teste");
		conjunto.add("X");
	
		System.out.println("Tamanho é "+ conjunto.size());

		//Nesse caso ele vai retornar true ou false, se for true ele revmoveu o objeto, se for false ele nao conseguio remover.
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("X"));
		
		//Contais verifica se existe o obejeto dentro da collection, ele vai retornar false ou true
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//Adiciona todos os dados do conjunto nuns, dentro de conjunto
		//conjunto.addAll(nums);
		System.out.println(conjunto);
		//faz a interseção, e só mostra
		conjunto.retainAll(nums);
	}
}
