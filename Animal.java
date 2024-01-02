package fazenda;

public class Animal implements Animais {
	protected static final int ARROBA = 15;
	public int id, idade;
	public double pesoEmQuilos;
	
	public Animal(int id, int idade, double pesoEmQuilos) {
		this.id = id;
		this.idade = idade;
		this.pesoEmQuilos = pesoEmQuilos;
	}
	
	public double alimentar() {
		return pesoEmQuilos;
	}
	public void emitirSom() {
		
	}
	public void estado() {
		
	}
	
	public double peso() {
		return this.pesoEmQuilos;
	}
	
	public String pesoEmQuilo() {
		return "Peso: " + peso() + " Kg";
	}
	
	public String converterParaArroba() {
		return "Peso em ARROBA: " + Math.round((this.pesoEmQuilos / ARROBA) * 100.0) / 100.0;
	}
	
	public double calcularPrecoEstimado() {
		return 0.0;
	}

}
