package Classes;

public class ProdutoTeste {
public static void main(String[] args) {
	Produto p1 = new Produto();
	p1.Nome = "Celular";
	p1.preco = 123456;
	p1.desconto = 0.6;
	
	var p2 = new Produto();
	p2.Nome = "Caneta azul";
	p2.preco = 1.25;
	Produto.desconto = 0.29;
	
	System.out.println(p1.Nome);
	System.out.println(p2.desconto); 
	
	double precofinal1 = p1.precoComDisconto();
	double precofinal2 = p2.preco *( 1- p2.desconto);
	System.out.println((precofinal1 + precofinal2)/ 2);
	
	//Aula 017
	//Utilizando o metodo PrecoComDisconto o código fica mais limpo e otimizado;
	
	Produto p3 = new Produto();
	p3.preco = 120;
	p3.desconto = 0.1;
	double precoFinal3 = p3.precoComDisconto();
	System.out.printf("o Preco com disconto é %.3f", precoFinal3);
	
	
	//Aula 018
	//usando o contrutor feito por mim;
	Produto teste1 = new Produto("lapis", 1.50);
	System.out.println("\n" + teste1.desconto);
	
	
}
}
