package DesafioDasClasses;

public class Pessoa {
	String pessoa;
	double peso;
	//Constructor padrao
	Pessoa(){}
	
	//constructor artificial
	Pessoa(String pessoa, double peso){
		this.pessoa = pessoa;
		this.peso = peso;
	}
	//Método comer
	void Comer(Comida comida) {
		System.out.println("O peso antes de comer é " +peso);
		peso += comida.pesoComida;
		System.out.println("O peso depois de comer é "+peso);
	}
	
}
