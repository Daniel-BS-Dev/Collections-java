package dio.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class TypeList {
	
	public static void main(String[]args) {
		
		
		List<Integer> grades = new ArrayList<>();
		
		// adicionado as nodas
		grades.add(7);
		grades.add(7);
		grades.add(9);
		grades.add(5);
		grades.add(8);
		
		// mostrando todas as notas
		System.out.println(grades.toString());
		
		//exibindo a posi??o 9.0, se n?o encontar retorn -1 
		System.out.println(grades.indexOf(9d));
		
		//adicionando na posi??o 4 o valor 8
		grades.add(4, 8);
		System.out.println(grades.toString());
		
		//substituindo 5.0 por 6.0
		grades.set(grades.indexOf(5), 6);
		System.out.println(grades.toString());
		
		//mostrando a terceira nota
		System.out.println(grades.get(2));
		
		//mostrando a menor nota
		System.out.println("Menor nota "+ Collections.min(grades));
		
		//mostarndo o maior valor
		System.out.println("Menor nota "+ Collections.max(grades));
	
		//somando todos os valores
		int sum=0;
		for(Integer n: grades) {
			sum += n;
		}
		System.out.println(sum);
		
		//mostarndo media
		System.out.println("Media "+ sum/grades.size());
	
		//removendo as notas menores que 8
		Iterator<Integer> iterator = grades.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			if(next < 8) {
				iterator.remove();
			}
		}
		System.out.println("Removendo notas menor que 8"+ grades.toString());
	
	 //mostrr de forma aleatoria
	 Collections.shuffle(grades);
	 System.out.println("aleatorio"+ grades.toString());
	
	
	
	}

}
