package br.com.cursojava8.embrulho2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NovoOrdenaStrings {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("Sergio");
		palavras.add("Adriano");
		palavras.add("Regina");
		palavras.add("Ludmila");
		palavras.add("Thiago");

		palavras.sort(Comparator.comparing(String::toUpperCase));
		
		palavras.forEach(System.out::println);
		
	}

}
		
		//palavras.sort(comparing(String::length));
		
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		/*palavras.sort((s1, s2) -> {
		    if(s1.length() < s2.length()) 
		        return -1;
		    if(s1.length() > s2.length()) 
		        return 1;
		    return 0;
		});*/



