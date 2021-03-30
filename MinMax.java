package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Alunos a1 = new Alunos("Ana", 7.1);
		Alunos a2 = new Alunos("Luna", 6.1);
		Alunos a3 = new Alunos("Gui", 8.1);
		Alunos a4 = new Alunos("Gabi", 10);
		
		List<Alunos> alunos = Arrays.asList(a1, a2, a3,a4);
		
		Comparator<Alunos> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		Comparator<Alunos> piorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;
		};
		
		
		
		
		
		System.out.println("Aluno com a melhor nota é a " + alunos.stream().max(melhorNota).get());
		System.out.println("Aluno com a pior nota é a " + alunos.stream().max(piorNota).get());
		
		System.out.println("Aluno com a menor melhor nota é a " + alunos.stream().min(melhorNota).get());
		System.out.println("Aluno com a menor pior nota é a " + alunos.stream().min(piorNota).get());
		
	}

}
