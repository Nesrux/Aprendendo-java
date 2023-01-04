package DesafioData;


public class DataTeste {
	public static void main(String[] args) {
		var n1 = new Data();
		n1.ano = 1999;
		n1.dia = 9;
		n1.mes = "marco";
		
		System.out.printf("O dia é %d, o mês é %s e o ano é %d \n", n1.dia, n1.mes, n1.ano);
	
		//=========================================================================================
		var n2 = new Data();
		n2.dia = 5;
		n2.mes = "julho";
		n2.ano = 2001;
		System.out.printf("%d / %s / %d \n", n2.dia, n2.mes, n2.ano);
		
		
		//==========================================================================================
		var n3 = new Data();
		n3.dia = 5;
		n3.mes = "Agosto";
		n3.ano = 1997;
		//System.out.println(n3.dataFormatada());
		//System.out.println(n3.retornaData());
		
		//aula 18
		
		Data teste = new Data(6, "abril", 2007);
		System.out.println(teste.dataFormatada());
}
}
