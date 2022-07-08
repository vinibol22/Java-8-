package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String>print = System.out::print;
		
		List<String>carros = Arrays.asList("bmw ","porche ","Renegade");
		
		carros.stream().map(m->m.toUpperCase()).forEach(print);
	
	
		
		
	//String ola = grito.andThen(maiuscula).andThen(primeiraLetra).apply("BMW");
			
	
	System.out.println("\nUsando composição");
	
	carros.stream().map(Utilitarios.maiuscula)
	.map(Utilitarios.primeiraLetra).map(Utilitarios::grito).forEach(print);
	}

}
