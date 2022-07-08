package lambdas.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String>aprovados = Arrays.asList("vinicius","Barbosa","guilherme");
	
		
		//forma tradicional	
		for(String aprova : aprovados) {
			System.out.println(aprova);
		}
		
		
		
		
		//Lambda 01	
		aprovados.forEach((nomes)->System.out.println(nomes+" "));

		aprovados.forEach(nomes->System.out.println(nomes+" "));
		
	
		
		
		//method reference 01
		aprovados.forEach(System.out::println);
		aprovados.forEach(Foreach::meuImprimir);

	}
		
	
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é "+nome);
	
}
}
