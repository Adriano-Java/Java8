package br.com.curso.java8.embrulho3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FiltroDEAlunosPorCurso {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Psicologia", 129));
		cursos.add(new Curso ("Qu�mica", 198));
		cursos.add(new Curso("F�sica", 185));
		cursos.add(new Curso("Biologia", 144));
		cursos.add(new Curso("Matem�tica", 245));
		cursos.add(new Curso("Portug�s", 150));
		cursos.add(new Curso("Hist�ria", 113));
		cursos.add(new Curso("Geografia", 155));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		/*OptionalDouble media = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos)
				.average();
		
		System.out.println(media);*/

		cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(
						c -> c.getNome(),
						c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
	}
}
