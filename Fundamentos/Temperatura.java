package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		var a = 1;
		//(f -32) X (5/9) = C
		final double n1 = 32;
		final double n2 = 5.0/9.0;
		double n3 = 39;
		double total = (n3 - n1) * n2;
		System.out.println(total);
		System.out.println(a);
	}
}
