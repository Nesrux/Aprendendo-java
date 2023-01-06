package Arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		double[] notasAluno = new double[3];
		notasAluno[0] = 8.7;
		notasAluno[1] = 9;
		notasAluno[2] = 7.7;
		
		
		//Arrays do java.util funciona para trabalhar com arrays, nesse caso ele me deixa imprimir a arrays
		System.out.println(Arrays.toString(notasAluno));
		System.out.println(notasAluno[0]); //Ver a  nota no indice 0 do array
		System.out.println(notasAluno[notasAluno.length - 1]); // Ver o indice do array
		//System.out.println(notasAluno[4]); ERRO, pois não existe índice 4/ 
		
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAluno.length; i++) {
			totalAlunoA += notasAluno[i];
		}
		System.out.println(totalAlunoA / notasAluno.length);
		//Outra forma de inicializar outro array
		
		double[] notasAlunoB = {6.9, 8.1, 5.9, 9.9};
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB/ notasAlunoB.length);
		
		
	}
}
