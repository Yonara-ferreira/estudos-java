package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
 
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Pedro", 5.6);
		Aluno a2 = new Aluno("Ana", 8.6);
		Aluno a3 = new Aluno("José", 3.6);
		Aluno a4 = new Aluno("Francisco", 9.6);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatoria = (a , b) -> a + b;
		
		alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(somatoria)
			.ifPresent(System.out :: println);
	}
}
