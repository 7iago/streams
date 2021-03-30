package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		Alunos a1 = new Alunos("Ana", 7.1);
		Alunos a2 = new Alunos("Luna", 6.1);
		Alunos a3 = new Alunos("Gui", 8.1);
		Alunos a4 = new Alunos("Gabi", 10);
		
		List<Alunos> alunos = Arrays.asList(a1, a2, a3,a4);
		
		Predicate<Alunos> aprovado = a -> a.nota >=7;
		Function<Alunos, Double> apenasNota = a -> a.nota;
				
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
				
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A média da turma é " + media.getValor());
	}

}
