package predicade;

import java.util.function.Predicate;

public class Predicado {
	public static void main (String[]args) {
		
		Predicate<Produto>isCaro = prod ->(prod.preco *(1 - prod.desconto))>= 750 ;
		
		Produto produto = new Produto(1000,0.02);
		
		System.out.println(isCaro.test(produto));
		
	}
}
