package br.com.curso.java8.embrulho3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ControleCursos {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Matem�tica", 45));
		cursos.add(new Curso("Portug�s", 150));
		cursos.add(new Curso("Hist�ria", 113));
		cursos.add(new Curso("Geografia", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		cursos.forEach(c -> System.out.println(c.getNome()));
	}
	
}
