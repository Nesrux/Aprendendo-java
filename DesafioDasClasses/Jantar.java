package DesafioDasClasses;

public class Jantar {
	public static void main(String[] args) {
		/*A classe pessoa vai ter o nome da pessoa,
		 *O peso da pessoa,
		 *Vai existir um método chamado comer e esse método comer vai receber como parametro um outro objeto da classe comida
		 *A classe comida vai ter o  nome da comida e o peso da comida (double),
		 *Quando a pessoa comer a comida o peso da comida vai ser somado com o peso da pessoa,
		 *Na classe jantar colocar o metodo main, e instanciar o objeto
		 *e no final voce mostra no console o peso antes de comer e o peso depois de comer*/
		
		Pessoa p = new Pessoa("joao", 98.270); 
		Comida c = new Comida("arroz", 0.950);
		p.Comer(c);
		//System.out.print(p.peso);
		
		Pessoa n1 = new Pessoa ("marcela", 78.28);
		Comida n2 = new Comida ("bife", 0.200);
		n1.Comer(n2);
	}

}
