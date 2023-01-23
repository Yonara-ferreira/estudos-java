package Lambdas;

import java.util.function.Function;

public class Funcao {

		public static void main(String[] args) {
			
			Function<Integer, String> parOuImpar = 
					num -> num % 2 == 0 ? "Par" : "Impar";
					
			System.out.println(parOuImpar.apply(32));
			
			Function<String, String> oResultado = 
					valor -> "O resultado é " + valor;
					
			Function<String, String> empolgado =
					valor -> valor + "!!!!";
					
			Function<String, String> duvida =
							valor -> valor + "??";
					
			System.out.println(empolgado);
			
			
			String resultadoFinal = parOuImpar
					.andThen(oResultado)
					.andThen(empolgado)
					.apply(32);
			System.out.println(resultadoFinal);
			
			String resultadoFinal1 = parOuImpar
					.andThen(oResultado)
					.andThen(duvida)
					.apply(35);
			System.out.println(resultadoFinal1);
		}
}
