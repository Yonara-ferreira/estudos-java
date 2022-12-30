package oo.composicao;

public class CompraTeste {

		public static void main(String[] args) {
			
			Compra compra1 = new Compra();
			compra1.Cliente = "Yonara Ferreira";
			compra1.adcionarItem("caneta", 20, 7.50);
			compra1.adcionarItem(new Item("Borracha", 4, 1.50));
			compra1.adcionarItem(new Item("cadernos", 3, 14.00));
			
			System.out.println(compra1.itens.size());
			System.out.println(compra1.obterValorTotal());
			
			double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
				System.out.println("o total é " + total);
		}
		
		
		
}
