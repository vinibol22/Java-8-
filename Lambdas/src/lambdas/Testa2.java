package lambdas;

public class Testa2 {

	public static void main(String[] args) {
		Calculo calculo = (x,y)->{return x+y;};
	
		System.out.println(calculo.calculo(8, 4));
	
	
		calculo = (x,y)->x*y;
		
		System.out.println(calculo.calculo(8, 4));	}

}
