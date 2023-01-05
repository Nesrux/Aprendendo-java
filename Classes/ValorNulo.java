package Classes;

public class ValorNulo {
	public static void main(String[] args) {
		//Aqui a String A é uma variavél aceita, pois mesmo não tendo um valor, ela aponta para um local de memória
		String a = "";
		System.out.println(a.concat("Bazinga!"));
		
		//Nesse caso como a vaariavel não foi inicializada, vai dar um erro de compilação no java, e ele nao vai deixar o arquivo .java virar um arquivo .Class, pois alguma regra da linguaguem foi quebrada;
		//String b;
		//System.out.println(b);
		
		//Nesse caso, vai vir um outro erro, em tempo de execução, o código será complilado e executado mais ele vai dar um err de nULL pointer exeception.
		//String s1 = null;
		//System.out.println(s1.concat("A"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mes = "marco";
			System.out.println(d1.dataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "opa" : null;
		if(s2 != null) {
			System.out.println(s2.concat("?????"));
		}
	}

}
