package consumer;

public class Produto {
	String nome ;
	int preco;
	public Produto(String nome,int preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "este � o nome "+this.nome +" este � o preco "+this.preco;
	}
}
