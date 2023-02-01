package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2,3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		int total = nums.stream().reduce(soma).get();
		System.out.println("o valor total é: " + total);
		
		Integer total2 = nums.parallelStream().reduce(100, soma);
		System.out.println("o valor total é: " + total2);
		
		
		//Resultado de um Opcional<Integer>...
		nums.stream()
			.filter(n -> n >10 )
			.reduce(soma)
			.ifPresent(System.out :: println);
	}
}
