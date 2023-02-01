package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Pedro", 5.6);
		Aluno a2 = new Aluno("Ana", 5.6);
		Aluno a3 = new Aluno("José", 5.6);
		Aluno a4 = new Aluno("Francisco", 5.6);
		Aluno a5 = new Aluno("Pedrinho", 5.6);
		Aluno a6 = new Aluno("Jorge", 5.6);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado =
				a -> "parabens" + a.nome + "!voce foi aprovado";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
	}
}
