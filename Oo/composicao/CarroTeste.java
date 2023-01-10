package Oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		//Faltou encapsulamento !!
		// c1.motor.fatorDeInjecao = -30;
		System.out.println(c1.motor.giros());
		
		//Por causa da relação biDirecional isso pode ser feito
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
		
		//

	}
}
