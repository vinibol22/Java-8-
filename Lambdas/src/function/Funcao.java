package function;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String>parOuImpar=numero->numero % 2 ==0?"Par":"Impar";
		
		//System.out.println(parOuImpar.apply(3));
		
		
		
		Function<String, String>oResultadoE = valor ->"O resultado é :"+valor;
		
		oResultadoE.apply("trinta");
		
		Function<String, String>empolgou = valor ->valor+"!!!";
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgou).apply(3);
		
		System.out.println(resultadoFinal);
		
	//	System.out.println(oResultadoE.apply(resultadoFinal));
		
	}
	

	
}
