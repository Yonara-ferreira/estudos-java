package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays
				.asList("Tainara", "Pedro", "Narah", "Hans");
		
		System.out.println("forma basica .. ");
		for(String nome: aprovados) {
				System.out.println(nome);
		}
		
		System.out.println("\nLambda #001...");
		aprovados.forEach((nome) -> { System.out.println(nome + "!!!!"); });
		
		
		System.out.println("\nMethod reference #001....");
		aprovados.forEach(System.out :: println);
		
		System.out.println("\nLambda #002...");
		aprovados.forEach(nome ->  meuImprimir(nome));
	
		System.out.println("\nMethod reference #002....");
		aprovados.forEach(Foreach :: meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("oi meu nome é " + nome);
	}
}
