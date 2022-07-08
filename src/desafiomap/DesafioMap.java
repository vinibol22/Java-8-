package desafiomap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Object>print = System.out::print;
		List<Integer>nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
	
		Function<Integer, String>binarios = n->n.toBinaryString(n)+" ";
		
		/*Function<String, String>inverter = n->{
			
			
			  String reversed = "";
			    for (int i = n.length() - 1;  0 <= i; i--) {
			        reversed += n.charAt(i);
			    }
			    return reversed;
		};
		*/
		
		Function<String,Integer>integerio = n->{
			int numeroConvertido = Integer.parseInt(n);
			return numeroConvertido;
		
		}; 
		
		nums.stream().map(binarios).map(Utility::inverter).map(integerio).forEach(print);
		System.out.println("....................");
	
		//nums.stream().map(Utility::inverter);
	}

}
