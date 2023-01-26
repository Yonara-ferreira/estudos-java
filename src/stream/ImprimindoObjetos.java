package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		
		List<String> aprovados = Arrays.asList("lu", "pedro","luca", "ana");
		
		System.out.println("Exibindo listas com For");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando iteration....");
		
		Iterator<String>  it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n Usando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out :: println);
	}
}
