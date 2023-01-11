package oo.encapsulamento;

public class PessoaTeste {

		public static void main(String[] args) {
			
			Pessoa p1 = new Pessoa("narah","ferreira", -30);
			p1.setIdade(260); // alterar dados 
		
					
			
			System.out.println(p1.getIdade());// ler dados 
			System.out.println(p1); // toString
			System.out.println(p1.getNomeCompleto());
			
		}
}
