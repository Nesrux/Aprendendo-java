package Oo.composicao;

public class Carro {
	
	//Para cada novo carro, vai ser criado um novo motor
	final Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
	}
	void acelerar() {
		if(motor.fatorDeInjecao < 2.60) {
		motor.fatorDeInjecao += 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorDeInjecao > 0.5) {
		motor.fatorDeInjecao -= 0.4;
		}
	}
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	boolean estaLigado() {
		return motor.ligado;
	}
}
