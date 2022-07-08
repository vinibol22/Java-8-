package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumir {
	
	public static void main(String[] args) {
	Consumer<Produto>imprimir = p ->System.out.println(p.nome);
	
	Produto p1 = new Produto("ola",4);
	Produto p2 = new Produto("ola1",5);	
	Produto p3 = new Produto("ola2",54);
	Produto p4 = new Produto("ola3",7);
	
	imprimir.accept(p1);
	
	List<Produto>produtos = Arrays.asList(p1,p2,p3,p4);
	produtos.forEach(imprimir);
	produtos.forEach(System.out::println);	
	}
	
}
