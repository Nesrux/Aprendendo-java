package Arrays;

public class ForEach {
public static void main(String[] args) {
	//For each é "para cada"
	
	double[] notas = {11.9, 10.1, 4.7, 3.3};

	//for padrao
	for (int i = 0; i < notas.length; i++) {
		System.out.print(notas[i] + " ");
	}
	System.out.println(" ");
	
	//For Each, que vai do primeiro até o ultimo index da array e se escreve do mesmo jeito que o for
	for (double nota : notas) {
		System.out.print(nota + " ");
	}
}
}
