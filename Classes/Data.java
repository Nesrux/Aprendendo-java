package Classes;

public class Data {
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
			//dia = 1;
			//mes = "janeiro";
			//ano = 1970;
			this(1, "marco", 2010);//Chamando um constructor dentro de outro constructor
					
		}
		
		Data(int dia, String mes, int ano){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		
		String dataFormatada() {
			final String formato = "%d/%s/%d";
			return String.format(formato, this.dia, this.mes, this. ano);
		}
	}

