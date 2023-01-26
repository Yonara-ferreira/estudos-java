package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
		public static void main(String[] args) {
			
			Consumer<String> print = System.out::print;
			Consumer<Integer> println = System.out::println;
			
			Stream<String> langs = Stream.of("java "," lua "," js\n ");
			langs.forEach(print);
			
			String[] maisLangs = {"Perls ", " C++ ", " phython\n "};
			Arrays.stream(maisLangs).forEach(print);
			Arrays.stream(maisLangs, 1, 2).forEach(print);
			
			List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotllin\n");
			outrasLangs.stream().forEach(print);
			outrasLangs.parallelStream().forEach(print);
			
			
			Stream.generate(() -> "a").forEach(print);
			Stream.iterate(0, n -> n + 1).forEach(println);
		}

}
