package dio.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import dio.com.entities.MySeries;

public class CollectionSet {
	
	public static void main(String[] args) {
		
		//passando o meus atributos dentro da lista
		Set<Double> grades = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		
		// mostrando o elementos
		System.out.println(grades.toString());
		
		//mostarndo minha classe de ordem aleatoria
		Set<MySeries> series = new HashSet<>() {{
			add(new MySeries("got", "Fantasy", 60));
			add(new MySeries("dark", "drama", 60));
			add(new MySeries("that 70s show", "comedia", 120));
		}};
		
		for(MySeries serie: series) {
		System.out.println(serie.getName() +" - "+ serie.getGenre()+ " - "+serie.getDurantion());
		}
		
		System.out.println("---------------------------");
		
		//ordendando de acordo com ordem de inserção
		Set<MySeries> series1 = new LinkedHashSet<>() {{
			add(new MySeries("got", "Fantasy", 60));
			add(new MySeries("dark", "drama", 60));
			add(new MySeries("that 70s show", "comedia", 120));
		}};
		
		for(MySeries serie: series1) {
		System.out.println(serie.getName() +" - "+ serie.getGenre()+ " - "+serie.getDurantion());
		}
		
		System.out.println("---------------------------");
		
		Set<MySeries> serie2 = new TreeSet<>(series1);
		for(MySeries serie: serie2) {
			System.out.println(serie.getName() +" - "+ serie.getGenre()+ " - "+serie.getDurantion());
			}
		
	}

}
