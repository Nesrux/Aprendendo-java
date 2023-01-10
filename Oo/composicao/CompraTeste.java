package Oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.itens.add(new Item("borracha", 12, 0.45));
		c1.itens.add(new Item("lapis", 10, 1.00));
		c1.itens.add(new Item("Caderno", 3, 20.0));
		c1.itens.add(new Item("Mochila", 1, 60));
		
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	
	}

}
