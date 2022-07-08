package lambdas;

@FunctionalInterface
public interface Calculo {
	public double calculo(int a ,int b);
	
	default String valeu() {
		return "vinicius";
	}
	
	static double somei(double a , double b) {
		return a+b;
	}
}
