package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class DesafioMap {

	public static void main(String[] args) {
		Consumer<Integer> imprimir = System.out::println;
		Consumer<String> print = System.out::println;
		Function<String, String> reverso = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> inteiro = i -> Integer.parseInt(i, 2);
		
		List<Integer> nums = Arrays.asList(1, 2 ,3, 4, 5, 6, 7, 8, 9);
		
		
		nums.stream()
			.map(Integer::toBinaryString)
			.forEach(print);
		
		System.out.println();
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(reverso)
		.forEach(print);
		
		System.out.println();
		
		nums.stream()
		.map(n -> n.toBinaryString(n))
		.map(reverso)
		.map(inteiro)
		.forEach(imprimir);
		
		
	}

}
