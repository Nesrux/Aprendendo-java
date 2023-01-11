package Oo.composicao.desafio;

public class ClienteTeste {	
	public static void main(String[] args) {
		
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("notebook", 2800),2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 800),1);
		
		Cliente cliente1 = new Cliente ("joao marcos de sousa");
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		System.out.println(cliente1.obterValorTotal());
		

	}
}
