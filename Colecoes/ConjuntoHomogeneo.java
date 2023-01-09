package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
	public static void main(String[] args) {
		//O <String> obriga a colecition ser apenas de String
		SortedSet<String> listaDeAprovados = new TreeSet<>();//O <> Se chama operador diamond
		listaDeAprovados.add("joao");
		listaDeAprovados.add("ana");
		listaDeAprovados.add("jorge");
		listaDeAprovados.add("balela");
		listaDeAprovados.add("oregano");
			for(String aprovados: listaDeAprovados) {
				System.out.println(aprovados);
			}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for( int numeros: nums) {
			System.out.println(numeros);
		}
	}
}
