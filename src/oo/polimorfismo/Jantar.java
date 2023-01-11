package oo.polimorfismo;

public class Jantar {

		public static void main(String[] args) {
			 
			Pessoa convidado = new Pessoa(99.50);
			
			Arroz ingrediente1 = new Arroz(0.256);
			Feijao ingrediente2 = new Feijao(0.600);
			
			
			System.out.println(convidado.getPeso());
			
			convidado.Comer(ingrediente1);
			convidado.Comer(ingrediente2);
			
			System.out.println(convidado.getPeso());
			
			Sorvete sobremesa = new Sorvete(0.6);
			
			convidado.Comer(sobremesa);
			System.out.println(convidado.getPeso());
			
			
		}
}
