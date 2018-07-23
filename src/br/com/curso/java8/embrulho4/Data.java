package br.com.curso.java8.embrulho4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
	
	public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
        System.out.println(dataFutura);
        
        Period periodo = Period.between(agora, dataFutura);
        System.out.println(periodo);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);
    }
	
}
