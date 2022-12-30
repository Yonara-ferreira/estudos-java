package Estudos_udemy;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor";
		
		do {
			System.out.println("voce precisa falar " 
		                        + "as palavras magicas...");
			System.out.println("quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("obrigada!");
		entrada.close();
	}
}
