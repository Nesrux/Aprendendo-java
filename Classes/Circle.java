package Classes;

public class Circle {
	//Final é para definir uma constante, que não pode ser alterado :@
	//Por convenção, como o Pi é uma constante, ele fica em maiusculo.
	static final double PI = 3.14;
	double raio;
	
	 Circle(double raioInicial) {
		 raio = raioInicial;
	}
	 
	double calcularAreaCirculo(){
		 return PI * Math.pow(raio, 2);
	 }
	 
}
