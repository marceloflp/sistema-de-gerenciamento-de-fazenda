package fazenda;

public class Gerente extends Funcionarios {
	private static final double PERCENTUAL_TOTAL_ARRECADADO = 0.25;
	public Gerente(String nome, int idade, int cpf) {
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
		return salario += (PERCENTUAL_TOTAL_ARRECADADO * Venda);
	}

	//RETORNANDO SALÁRIO PARA UTILIZAR NA CLASSE MAIN
	@Override
	public String SalarioFuncionario() {
		return "R$" + this.salario;
	}
	
	//RETORNDO SALÁRIO PARA MANIPULAR NA CLASSE FAZENDA
	public double salario() {
		return this.salario;
	}
}
