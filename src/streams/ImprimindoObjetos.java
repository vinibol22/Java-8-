package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[]args ) {
		
		
		
		
		List<String>nomes = Arrays.asList("vini","ma","angeli");
		
		System.out.println("Usando o foreach");
		for(String nome : nomes) {
			
			System.out.println(nome);
			
		}
		System.out.println("..............");
		
		
		System.out.println("usando o iterator");
		Iterator<String>it =nomes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(".........................");
		System.out.println("usando stream");
		
		Stream<String>st = nomes.stream();
		
		st.forEach(System.out::println);
	}
}