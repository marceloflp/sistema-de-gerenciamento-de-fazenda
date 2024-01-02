package fazenda;

public class ExtratorLeite extends Funcionarios {
	private double percentual_venda = 0.15;
	
	public ExtratorLeite(String nome, int idade, int cpf) {
		super(nome, idade, cpf);
	}

	//EXIBINDO ESTADO
	@Override
	public void exibirEstado() {
	    System.out.println("Nome: " + this.nome);
	    System.out.println("Idade: " + this.idade);
	    System.out.println("Salário: " + "R$ " + this.salario);
	}

	//CALCULANDO SALÁRIO
	@Override
	public double calcularSalario(double Venda) {
		return this.salario += (percentual_venda * Venda);
	}

	//EXTRAINDO LEITE DA VACA
	public double extrairLeite(Animal animal) {
		if(animal instanceof Vacas) {
			Vacas vaca = (Vacas) animal;
			return vaca.extrairLeite();
		} else {
		return 0.0;
		}
	}
	
	//MUDANDO PERCENTUAL DE VENDA
	public void mudarPercentualdeVenda(double percentual) {
		this.percentual_venda = percentual;
	}
	
	//RETORNANDO SALÁRIO PARA UTILIZAR NA CLASSE FAZENDA E MAIN
	@Override
	public String SalarioFuncionario() {
		return "R$" + Math.round(this.salario * 100.0) / 100.0;
	}
	
	//RETORNDO SALÁRIO PARA MANIPULAR NA CLASSE FAZENDA
	public double salario() {
		return this.salario;
	}
	
}
