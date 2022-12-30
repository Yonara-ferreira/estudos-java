package Estudos_udemy;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("acabou")) {
			System.out.println("fale:");
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}

}
