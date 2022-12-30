package Novo_modulo;



public class Produto_teste {

		public static void main(String[] args) {
			
			Produto p1 = new Produto();
			p1.nome = "notebook";
			p1.desconto=0.25;
			p1.preco=6982.89;
			
			var p2 = new Produto();
			p2.nome="Caneta preta";
			p2.desconto=0.29;
			p2.preco=12.18;
			
			System.out.println(p1.nome);
			System.out.println(p2.nome);
			
			double precoFinal1 = p1.precoComDesconto();
			double precoFinal2 = p2.precoComDesconto();
			double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
			
			System.out.printf("Media do Carrinho = R$%.2f.", mediaCarrinho);
			
		}
}
