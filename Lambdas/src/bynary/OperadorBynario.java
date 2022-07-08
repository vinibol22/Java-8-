package bynary;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBynario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator<Double>media = (n1,n2)-> (n1+n2)/2;
		
		System.out.println(media.apply(9.8,5.0));
		
		BiFunction<Double, Double, String>media2 = (n1,n2) ->{
			
			
		double notaAluno = (n1+n2)/2 ;
		return notaAluno >= 7 ? "Aprovado":"Reprovado";			
		};
		
			System.out.println(media2.apply(6.0, 5.2));
	
			Function<Double, String>conceito = m->m >= 7 ? "Aprovado" : "Reprovado";
			
			System.out.println(media.andThen(conceito).apply(9.7,7.3));
				
			}

}
