package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
		
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.54, 0.99);
		imprimir.accept(p1);
		
		 
		Produto p2 = new Produto("Caderno", 15.54, 0.1);
		Produto p3 = new Produto("Lapis", 1.54, 0.3);
		Produto p4 = new Produto("borracha", 0.54, 0.19);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out :: println);
	}

}
