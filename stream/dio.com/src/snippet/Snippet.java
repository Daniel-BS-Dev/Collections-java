package snippet;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Snippet {
	public static void main(String[] args) {
		
		List<String> randomNumbers = Arrays.asList("1","0","4","1","3","9","9","6","5");
		
		//"Imprimindo todos os elementos dessa lista de String"
		randomNumbers.forEach(System.out::print);
		
		System.out.println("");
		
		//pegando os 5 primeiros numeros da lista
		randomNumbers.stream()
		             .limit(5)
		             .collect(Collectors.toSet())
		             .forEach(System.out::print);
		
		System.out.println("");
		
		//transformando minha lista em inteiro
		List<Integer> numbers = randomNumbers.stream()
				     .map(Integer::parseInt)
				     .collect(Collectors.toList());
		             
        
        System.out.println(numbers);
		
		//pegando os numeros pares e maiores que 2
        randomNumbers.stream()
                     .map(Integer::parseInt)
                     .filter(i -> (i % 2 == 0 && i > 2)) 
                     .collect(Collectors.toList())
                     .forEach(System.out::print);
        
        System.out.println("");
        
        //mostrando a media da minha lista
        randomNumbers.stream()
                     .mapToInt(Integer::parseInt)//para trabalha com a media eu uso o mapToInt
                     .average()
                     .ifPresent(System.out::print);//verifica se esta presente pra não retorna valor null
        
        System.out.println("");
	
	//removendo os numeros impares
         numbers.removeIf(i -> (i % 2 != 0));
         System.out.println(numbers);            
	
	}
}

