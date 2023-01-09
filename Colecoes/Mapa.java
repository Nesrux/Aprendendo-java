package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		//O método map, serve tanto para adicionar novos dados, quanto subistituir outros valores
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Cleiton");
		usuarios.put(3, "Lissandra");
		
		System.out.println(usuarios.size());
		System.out.println(!usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); //Retorna as chaves em uma array
		System.out.println(usuarios.values()); // retorna os valores em uma array
		System.out.println(usuarios.entrySet()); //retorna a chava juntamente com o valor dentro de um array
		
		System.out.println(usuarios.containsKey(1)); //Verificia se existe uma chave
		System.out.println(usuarios.containsValue("Lissandra")); // verifica se existe um valor
		
		System.out.println(usuarios.get(2)); // Pega o valor pela chave
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getValue());
			System.out.println(registro.getKey());
		}
	}
}
