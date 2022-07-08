package unary;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer>maisDois = n ->n+2;
		UnaryOperator<Integer>vezesDois = n -> n*2;
		UnaryOperator<Integer>aoQdrado = n -> n*n;	
		
		
		int resultado = maisDois.andThen(vezesDois).andThen(aoQdrado).apply(5);
	
		System.out.println(resultado);
		
		int resultado2 = aoQdrado.compose(vezesDois).compose(maisDois).apply(0);
				System.out.println(resultado2);
	
	}

}
