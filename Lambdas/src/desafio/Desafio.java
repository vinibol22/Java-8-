package desafio;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto prod = new Produto("Ipad", 9000.0,0.015);
	
		UnaryOperator<Double>desconto = n -> n -(n * prod.desconto);
		
		//UnaryOperator<Double>ola = n -> n:n>=7500.0?n<7500.0;
		
		Function<Double,Double>imposto=numero->numero >= 7500?numero +(numero*0.085):numero;
		
		Function<Double, Double>frete= num -> num >=3000 ?num +100:num+50;
		
		//DecimalFormat df = new DecimalFormat("0.00");
		//UnaryOperator<Double> arrendondar = nums->Double.parseDouble(String.format("%.2f", nums));
		
		
	//	double numerocorreto = arrendondar.andThen(desconto).andThen(imposto).andThen(frete).apply(prod.preço);
		double numerocorreto = frete.andThen(desconto).andThen(imposto).apply(prod.preço);
		System.out.println(numerocorreto); 
	
		//Function<Double, String>
		//System.out.println(imposto.apply(7600.0));
		//System.out.println(desconto.apply(500.00));
	//	System.out.println(frete.apply(3000.0));
	
	}

}
