package DesafioData;

public class Data{
/*1) Dentro da classe data crie 3 atributos, dia, mês e ano
 *2)Depois cirar uma classe DataTeste e depois fazer o usuario instanciar duas datas
 *3)Crie um metodo que retorne uma data fomatada sem usar o syso, dd/mm/aaaa 
 *4) Acrescentar o contrutor padrao do java
 *5) acrescentar o contrutor que vai receber dia mes e ano
 *6) no construtor padrão, faça ele retornar uma data defoult caso essa data não for informada, a data é 1/ janeiro / 1970*/
	
/*
	Integer dia;
	Integer ano;
	String mes;
	
	String retornaData() {
		String diaS = dia.toString();
		String anoS = ano.toString();
		String retornaTudo = diaS + '/' + mes + '/' + anoS;
		return retornaTudo;
	}
*/	
	//Feito com o professor;
	
	int dia;
	int ano;
	String mes;
	
	Data(){
		dia = 1;
		mes = "janeiro";
		ano = 1970;
				
	}
	
	Data(int diaF, String mesF, int anoF){
		dia = diaF;
		mes = mesF;
		ano = anoF;
	}
	
	String dataFormatada() {
		return String.format("%d/%s/%d", dia, mes, ano);
	}
}
