package Classes;

public class Produto {
	String Nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String NomeDoProduto, double precoInicial){
		Nome = NomeDoProduto;
		preco = precoInicial;
	}
	//Construtor padrão do java
	Produto(){}
	double precoComDisconto() {
		double calcComDisconto = preco - (preco * desconto);
		return calcComDisconto;
	}
	

}
