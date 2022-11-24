package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double n1 = 1;
		System.out.println(n1);
		//foi passado um valor sem ponto flutuante e o proprio java fez a conversao
		
		float n2 = (float) 1.234567888888;//explicita {CAST}
		System.out.println(n2);//arredondou o 78888 para 8 "Foi truncado"
		
		
		//o maximo do byte é 127, depois disso ele vai para negativo
		int c = 128;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
		//não arredondou e ficou com 1
		//usar sempre o int e o double como padrao
	}
}
