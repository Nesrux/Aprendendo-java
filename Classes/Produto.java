package Classes;

public class Produto {
	String Nome;
	double preco;
	double desconto;
	
	
	Produto(String NomeDoProduto, double precoInicial, double descontoPadrao){
		Nome = NomeDoProduto;
		preco = precoInicial;
		desconto = descontoPadrao;
	}
	//Construtor padrão do java
	Produto(){}
	double precoComDisconto() {
		double calcComDisconto = preco - (preco * desconto);
		return calcComDisconto;
	}
	

}
