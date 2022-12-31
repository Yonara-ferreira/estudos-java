package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		 
		Aluno aluno1 = new Aluno("Joana");
		Aluno aluno2 = new Aluno("Tainara");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Java Scritp");
		Curso curso3 = new Curso("Banco de dados");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCursos(curso3);
		aluno2.adicionarCursos(curso3);
		aluno3.adicionarCursos(curso3);
		
		for(Aluno aluno: curso1.alunos){
			System.out.println("Estou matriculado no curso 1..." + curso3.nome);
			System.out.println("... e meu nome é " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
			if(cursoEncontrado != null) {
				System.out.println(cursoEncontrado.nome);
				System.out.println(cursoEncontrado.alunos);
			}
	}
	
}
