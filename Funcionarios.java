package fazenda;

public abstract class Funcionarios {
	protected String nome;
	protected int idade, cpf;
	protected double salario;
	
	public Funcionarios(String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.salario = 2400.70;
	}
	
	public abstract void exibirEstado();
	
	public abstract double calcularSalario(double Venda);
	
	public abstract String SalarioFuncionario();

	public abstract double salario();
}
