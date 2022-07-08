package desafiomap;

public class Utility {
	private Utility() {
		
	}
	public final static String inverter(String original) {
	    String reversed = "";
	    for (int i = original.length() - 1;  0 <= i; i--) {
	        reversed += original.charAt(i);
	    }
	    return reversed;
	}
	
}
