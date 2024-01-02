package fazenda;

public class Porcos extends Animal {
	private static final double ACRESCIMO_PESO = 4.5;
    protected static final double LIMITE_PESO_ABATE = 100.0;
    private double preco_kg_abate = 8.0;
	
	
	public Porcos(int id, int idade, double pesoEmQuilos) {
		super(id, idade, pesoEmQuilos);

	}

	//ALIMENTANDO PORCO E AUMENTANDO SEU PESO
	@Override
	public double alimentar() {
		 return this.pesoEmQuilos += ACRESCIMO_PESO;
	}
	
	//EMITINDO SOM
	@Override
	public void emitirSom() {
		System.out.println("OINC OINC, IIIHHH");
	}
	
	//EXIBINDO ESTADO
	@Override
	public void estado() {
		System.out.println("ID: " + this.id + "\nidade: " + this.idade
				+ "\nPeso Em Quilos: " + this.pesoEmQuilos
				+ "Kg\n" +this.converterParaArroba());
	}
	
	//CALCULANDO PREÇO DO PORCO PARA ABATE
	@Override
	public double calcularPrecoEstimado() {
        return this.pesoEmQuilos * this.preco_kg_abate;
    }
	
	//MUDANDO PREÇO POR QUILO DO PORCO PARA ABATE
	public void mudarPrecoPorKgAbate(double novoValor) {
		this.preco_kg_abate = novoValor;
		System.out.println("Novo Valor Por Quilo Para Abate Atualizado!");
	}
	
	
}
