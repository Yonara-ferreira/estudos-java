package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo = (x, y) ->{
			return x + y;
		};
		
		System.out.println(calculo.apply(5.0, 3.0));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.apply(4.0, 3.0));
		
		
		BinaryOperator<Integer> calc = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc.apply(5, 3));
		
		calculo = (x, y) -> x * y;
		System.out.println(calc.apply(4, 3));
	}

}
