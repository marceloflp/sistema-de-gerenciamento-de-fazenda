package fazenda;

import java.util.Random;

public class Vacas extends Animal {
	private static final double ACRESCIMO_PESO = 2.0;
    private double preco_litro_leite = 2.0;

	public Vacas(int id, int idade, double pesoEmQuilos) {
		super(id, idade, pesoEmQuilos);

	}

	//ALIMENTANDO VACA E AUMENTANDO SEU PESO
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
	
	//CALCULANDO PREÇO
	@Override
	public double calcularPrecoEstimado() {
        return extrairLeite() * preco_litro_leite;
    }
	
	public double getPreco_litro_leite() {
		return preco_litro_leite;
	}

	//MUDANDO PREÇO DO LEITE PO LITRO VENDIDO
	public void mudarPrecoPorlitroleite(double preco_litro_leite) {
		this.preco_litro_leite = preco_litro_leite;
		System.out.println("Novo Valor Por Litro de Leite Atualizado!");
	}

	//EXTRANDO LEITE
	public double extrairLeite() {
        Random random = new Random();
        return random.nextDouble() * (10-2) + 2;
    }
	
	public void mudarPercentualdeVenda(double percentual) {
		
	}
	
}
