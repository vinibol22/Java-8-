package lambdas;

import java.util.function.BinaryOperator;

public class Testa3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double>calc=(x,y)->x+y;
		System.out.println(calc.apply(5.7, 7.6));
	}

}
