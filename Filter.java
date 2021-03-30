package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Filter {

	public static void main(String[] args) {
		
		Alunos a1 = new Alunos("Ana", 7.8, false);
		Alunos a2 = new Alunos("Bia", 5.8, true);
		Alunos a3 = new Alunos("Daniel", 9.8, true);
		Alunos a4 = new Alunos("Gui", 6.8, true);
		Alunos a5 = new Alunos("Rebeca", 7.1, true);
		Alunos a6 = new Alunos("Pedro", 8.8, false);
		
		List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Alunos> aprovado = a -> a.nota >= 7;
		Predicate<Alunos> comportamento = a -> a.bomCoportamento;
		Function<Alunos, String> saudacaoAprovado = 
				a -> "Parabens " + a.nome + " você foi aprovado!";
		
		alunos.stream()
			.filter(aprovado)
			.filter(comportamento)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
	}

}
