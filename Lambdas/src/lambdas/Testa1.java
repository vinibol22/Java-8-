package lambdas;

public class Testa1 {
	public static void main(String[]args) {
		
		
		Calculo soma = new Soma();
		Calculo mult = new Multiplica();
		
		
		System.out.println(soma.calculo(4, 4));
		System.out.println(mult.calculo(7, 8));
	}
}	
