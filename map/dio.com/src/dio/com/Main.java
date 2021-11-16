package dio.com;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		Map<String, Book> myBooks = new HashMap<>() {{
			put("Haaking Stephen", new Book("Uma breve historia do tempo", 600));
			put("Duhigg Charles", new Book("O poder do habito", 400));
			put("Harari, Yuval noah", new Book("21 lições para o seculo 21", 500));
		}};
		
		//imprimindo só a chave e o nome
		for(Map.Entry<String, Book> book: myBooks.entrySet()) {
			System.out.println(book.getKey()+" - "+ book.getValue().getName());
		}
		
	}

}
