package Classes;
import DesafioData.Data;
public class ValorVsReferencia {
public static void main(String[] args) {
	double a = 2;
	double b = a; //atribuição por valor (Tipo primitovo):
	
	a++;
	b--;
	System.out.println(a);
	System.out.println(b);
	
	Data d1 = new Data();
	Data d2 = d1; //Atribuição por referencia (Objeto)

	d1.dia = 31;
	d2.ano = 2997;
	System.out.println(d1.dataFormatada());
	System.out.println(d2.dataFormatada());
	//Nesse caso os dois são iguais, pois foi feita a atribuição por referencia.

	voltarParaPadrao(d1);
	System.out.println(d1.dataFormatada());
	System.out.println(d2.dataFormatada());
	
	//Oque é passado para o metodo é uma cópia, e não a referencia na memória, então nesse caso não vai mudar o valor de x
	int x = 3; 
	incrementoPrimitivo(x);
	System.out.println(x);

}
		static void voltarParaPadrao (Data d) {
			d.dia = 1;
			d.mes = "janeiro";
			d.ano = 1970;
					
		}
		static void incrementoPrimitivo (int a) {
			a++;
		}
}
