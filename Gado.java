package fazenda;

public class Gado extends Animal {
	private static final double ACRESCIMO_PESO = 5.0;
    protected static final double LIMITE_PESO_ABATE = 588.0;
    private double preco_kg_abate = 10.0;
	
	public Gado(int id, int idade, double pesoEmQuilos) {
		super(id, idade, pesoEmQuilos);
	}

	//ALIMENTANDO GADO E AUMENTANDO SEU PESO
	@Override
	public double alimentar() {
		 return this.pesoEmQuilos += ACRESCIMO_PESO;
	}
	
	//EMITINDO SOM
	@Override
	public void emitirSom() {
		System.out.println("MUUUUUUUUUUUUUUUUUUUUU");
	}
	
	//EXIBINDO ESTADO
	@Override
	public void estado() {
		System.out.println("ID: " + this.id + "\nidade: " + this.idade
				+ "\nPeso Em Quilos: " + this.pesoEmQuilos
				+ "Kg\n" +this.converterParaArroba());
	}
	
	//CALCULANDO PREÇO POR QUILO PARA ABATE
	@Override
	public double calcularPrecoEstimado() {
        return this.pesoEmQuilos * this.preco_kg_abate;
    }
	
	//MUDANDO PREÇO POR QUILO DO GADO PARA ABATE
	public void mudarPrecoPorKgAbate(double novoValor) {
		this.preco_kg_abate = novoValor;
		System.out.println("Novo Valor Por Quilo Para Abate Atualizado!");
	}
	
	
}
