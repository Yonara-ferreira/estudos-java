package oo.composicao;

import java.util.ArrayList;

public class Compra {

		String Cliente;
		
		ArrayList<Item> itens = new ArrayList<Item>();
		
		
		void adcionarItem(Item item) {
			itens.add(item);
			item.compra = this;
		}
		
		void adcionarItem(String nome, int quantidade, double preco) {
			this.adcionarItem(new Item(nome, quantidade, preco));
		}
		
		
		double obterValorTotal() {
			double total = 0;
			
			for(Item item: itens) {
				total += item.quantidade * item.preco;
			}
			
			return total;
		}
}
