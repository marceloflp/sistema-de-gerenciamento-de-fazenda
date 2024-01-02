package fazenda;

public class TratadorAnimais extends Funcionarios {
	private double percentual_venda = 0.15;

    public TratadorAnimais(String nome, int idade, int cpf) {
        super(nome, idade, cpf);
    }

    //CALCULANDO SÁLARIO
    @Override
    public double calcularSalario(double Venda) {
        return this.salario += (percentual_venda * Venda);
    }
    
    //EXIBINDO ESTADO
    @Override
    public void exibirEstado() {
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Idade: " + this.idade);
    	System.out.println("Salário: " + "R$ " + this.salario);
    }

  //RETORNANDO SALÁRIO PARA UTILIZAR NA CLASSE MAIN
	@Override
	public String SalarioFuncionario() {
		return "R$" + Math.round(this.salario *100.0) / 100.0;
	}
    
	//MUDANDO PERCENTUAL DE VENDA
	public void mudarPercentualdeVenda(double percentual) {
		this.percentual_venda = percentual;
	}
	
	//RETORNDO SALÁRIO PARA MANIPULAR NA CLASSE FAZENDA
	public double salario() {
		return this.salario;
	}
	
}
