package br.com.curso.java8.embrulho3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NovosCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Psicologia", 129));
		cursos.add(new Curso ("Química", 198));
		cursos.add(new Curso("Física", 185));
		cursos.add(new Curso("Biologia", 144));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >=150)
			.forEach(c -> System.out.println(c.getNome()));
	}
	
}
