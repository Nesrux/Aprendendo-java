package Desafios;

public class DesafioAritimetica {
	public static void main(String[] args) {
		//Resolver uma conta quebrando ela em partes e utilizando
		//o math.pow.
		
		int n1 = 6 *(3+2);
		int n2 = (int) Math.pow(n1, 2);
		int n3 = 3 * 2;
		int r = n2 / n3;
		//Fim da primeira parte em cima
		
		int n4 = 1 - 5;
		int n5 = 2 - 7;
		int m1 = n4 * n5;
		int n6 = m1 /2;
		int r2 = (int) Math.pow(n6, 2);
		
		//fim da segunda parte em cima
		
		int r3 = r - r2;
		int n7 = (int) Math.pow(r3, 3);
		
		int r4 = (int) Math.pow(10, 3);
		
		int resultado = n7 / r4;
		System.out.println(resultado);	
		
	}
}
