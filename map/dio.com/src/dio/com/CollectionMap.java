package dio.com;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionMap {
	
	public static void main(String[] args) {
		
		//instanciando um Map,não pode ter chave duplicadas, primeiro key, segundo value
		Map<String, Double> popularCars = new HashMap<>() {{
			put("gol", 14.4);
			put("toro", 14.4);
			put("hb20", 14.4);
		}};
		
		System.out.println(popularCars);
		
		//substituindo o consumo do gol por 15,2. se eu ja tenho a chave ele não cria uma igual
		popularCars.put("gol", 15.2);
		System.out.println(popularCars);
		
		//verificando se a minha list contem a chave turqueso
		System.out.println(popularCars.containsKey(popularCars));
		
		//exibindo o consumo do carro toro
		System.out.println(popularCars.get("toro"));
		
		//exibindo o modelo adicionado
		System.out.println(popularCars.keySet());
		
		//exibindo os valores
		System.out.println(popularCars.values());
		
		//retornando o maior valor
		Double consume = Collections.max(popularCars.values());
		Set<Map.Entry<String,Double>> entries = popularCars.entrySet();
		String model = "";
		
		for(Map.Entry<String,Double> entry: entries) {
			if(entry.getValue().equals(consume)) {
				model = entry.getKey();
				System.out.println(consume + " " +model);
			}
		}
		
		
		
	}

}
