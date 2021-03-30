package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Alunos a1 = new Alunos("Ana", 7.1);
		Alunos a2 = new Alunos("Luna", 6.1);
		Alunos a3 = new Alunos("Gui", 8.1);
		Alunos a4 = new Alunos("Gabi", 10);
		Alunos a5 = new Alunos("Ana", 7.1);
		Alunos a6 = new Alunos("Pedro", 6.1);
		Alunos a7 = new Alunos("Gui", 8.1);
		Alunos a8 = new Alunos("Maria", 10);
		
		List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit...");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile...");
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
		
		System.out.println("\nteste filter...");
		alunos.stream()
		.filter(a -> a.nome.contains("Pedro"))
		.forEach(System.out::println);
		
		
		
	}
}
