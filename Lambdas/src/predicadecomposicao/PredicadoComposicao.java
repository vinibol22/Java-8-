package predicadecomposicao;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>isPar = num -> num % 2 ==0;
		Predicate<Integer>treDigitos = num -> num>99 && num <= 999;
		System.out.println(isPar.and(treDigitos).test(123));
		System.out.println(isPar.or(treDigitos).test(123));
		System.out.println(isPar.or(treDigitos).negate().test(123));

		

	}

}
