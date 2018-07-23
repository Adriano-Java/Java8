package br.com.curso.java8.embrulho3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TotalAlunos {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Psicologia", 129));
		cursos.add(new Curso ("Química", 198));
		cursos.add(new Curso("Física", 185));
		cursos.add(new Curso("Biologia", 144));
		cursos.add(new Curso("Matemática", 245));
		cursos.add(new Curso("Portugês", 150));
		cursos.add(new Curso("História", 113));
		cursos.add(new Curso("Geografia", 155));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();
		
		System.out.println("Total de Alunos matriculados: " + sum);
		
		cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(c -> System.out.println("Curso com mais alunos matriculados: " + c.getNome()));
		
	}

}
