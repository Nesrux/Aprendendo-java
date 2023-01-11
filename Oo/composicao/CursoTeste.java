package Oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("joao");
		Aluno a2 = new Aluno("marcos");
		Aluno a3 = new Aluno("Marcela");
		Aluno a4 = new Aluno("gorge");
		
		Curso c1 = new Curso("java Completo");
		Curso c2 = new Curso("JavaScrtopt completo");
		Curso c4 = new Curso("SQL do bom");
		
		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);
		
		c2.adicionarAluno(a3);
		c2.adicionarAluno(a1);
		
		c4.adicionarAluno(a1);
		c4.adicionarAluno(a2);
		c4.adicionarAluno(a3);
		c4.adicionarAluno(a4);
		
		for(Aluno aluno: c4.alunos) {
			System.out.println("os alunos matriculados nesse curso são: ");
			System.out.println(aluno.nome);
			System.out.println();
		}
		//Usando o toString esse função trnasforma retornos em string
		System.out.println(a1.cursos.get(0).alunos);
		Curso achei = a2.obterCursoPorNome("SQL do bom");
		System.out.println(achei);
	}
}


