package dio.com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExempleList {
	
	public static void main(String[] args) {
	
	List<String> names = new ArrayList<>() {{
		add("Daniel");
		add("Alana");
		add("Maria");
		add("Felipe");
		add("Jeferson");
	}};
	
	System.out.println(names);
	
	//order alfabetica
	Collections.sort(names);
	System.out.println(names);
	
	//atualizar name
	names.set(3, "daro");
	System.out.println(names);
	
	//removendo o name daro
	names.remove(3);
	System.out.println(names);
	
	//tamanho da list
	System.out.println(names.size());
	
	//pegando a posi??o do elemento. Se n?o tem ele returna -1
	System.out.println(names.indexOf("Paulo"));
	
	//pegando um valor
	System.out.println(names.get(2));
	
	//contem elemento na list
	System.out.println(names.contains("Paulo"));
	
	//limpando a list
	names.clear();
	System.out.println(names);
	}
}
