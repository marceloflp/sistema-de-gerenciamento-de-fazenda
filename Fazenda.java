package fazenda;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
	private String nome, cidade, estado;
	private double tamanho;
	private double rendaDaFazenda, vendasGado, vendasPorcos, vendasLitrosLeite;
	private List<Animal> animais;
	private List<Funcionarios> funcionarios;
	
	//CONSTRUTOR
	public Fazenda() {
		this.nome = "Fazenda Céu Azul";
		this.cidade = "Recife";
		this.estado = "Pernambuco";
		this.tamanho = 6000.0;
		this.animais = new ArrayList<>();
		this.funcionarios = new ArrayList<>();
		this.rendaDaFazenda = 0.0;
		this.vendasGado = 0.0;
		this.vendasPorcos = 0.0;
		this.vendasLitrosLeite = 0.0;
	}
	
	//INFORMAÇÕES SOBRE A FAZENDA
	public void infoFazenda() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Estado: " + this.estado);
		System.out.println("Dimensão: " + this.tamanho + " m²");
	}
	
	//ADICIONANDO ANIMAL NA FAZENDA
	public void adicionarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	//REMOVENDO ANIMAL DA FAZENDA
	public void removerAnimal(Animal animal) {
		animais.remove(animal);
	}
	
	//ADICIONANDO FUNCIONÁRIO NA FAZENDA
	public void adicionarFuncionario(Funcionarios funcionario) {
        funcionarios.add(funcionario);
    }

	//REMOVENDO FUNCIONÁRIO NA FAZENDA
    public void removerFuncionario(Funcionarios funcionario) {
        funcionarios.remove(funcionario);
    }
    
    //ANIMAL EMITINDO SON
    public void emitirSom(Animal animal) {
    	animal.emitirSom();
    }
    
    //EXIBINDO ESTADO DO ANIMAL
    public void exibirEstado(Animal animal) {
    	animal.estado();
    }
    
    //CALCULANDO PREÇO DO ANIMAL
    public void calcularPrecoEstimadoAnimal(Animal animal) {
    	System.out.printf("Preço estimado do animal: R$ %.2f%n", animal.calcularPrecoEstimado());
    }
    
    //CALCULANDO PREÇO DOS ANIMAIS PARA ABATE
    public void calcularPrecoEstimadoAnimaisParaAbate() {
    	double precoTodosGado = 0.0;
    	double precoTodosPorcos = 0.0;
    	for (Animal animal : animais) {
    		if(animal instanceof Gado) {
    			Gado gado = (Gado) animal;
    			precoTodosGado += gado.calcularPrecoEstimado();
    		} else if(animal instanceof Porcos) {
    			Porcos porco = (Porcos) animal;
    			precoTodosPorcos += porco.calcularPrecoEstimado();
    		}
    	}
    	System.out.println("Somatório do preço de todo o GADO: " + precoTodosGado);
    	System.out.println("Somatório do preço de todos os PORCOS: " + precoTodosPorcos);
    }
    
    //EXTRAINDO LEITE DA VACA
    public void extrairLeite(Funcionarios funcionario, Animal animal) {
    	double venda = 0.0;
    	if(funcionario instanceof ExtratorLeite && animal instanceof Vacas) {
    		ExtratorLeite extrator = (ExtratorLeite) funcionario;
    		Vacas animal1 = (Vacas) animal;
    		venda = extrator.extrairLeite(animal1);
    		System.out.printf("Litros de leite: %.2f L%n", venda);
    		this.vendasLitrosLeite += (animal1.getPreco_litro_leite() * venda); 
    		this.rendaDaFazenda += this.vendasLitrosLeite;
    		extrator.calcularSalario(venda);
    		
    	}
    }
    
    //ALIMENTANDO ANIMAL
    public void alimentar(Animal animal) {
    	if(animal instanceof Gado) {
    		Gado gado = (Gado) animal;
    		gado.alimentar();
    		//SE, APÓS ALIMENTAR, ESTIVER ACIMA DO LIMITE PARA ABATE, O ANIMAL SERÁ VENDIDO
    		if(gado.peso() >= Gado.LIMITE_PESO_ABATE) {
    			System.out.println("GADO ALIMENTADO!");
    			System.out.println("GADO: " + gado.id + " - Peso ideal para abate, animal vendido!");
    			this.vendasGado += gado.calcularPrecoEstimado();
    			animais.remove(animal);
    		}
    	} else if (animal instanceof Porcos) {
    		Porcos porco = (Porcos) animal;
    		porco.alimentar();
    		//SE, APÓS ALIMENTAR, ESTIVER ACIMA DO LIMITE PARA ABATE, O ANIMAL SERÁ VENDIDO
    		if(porco.peso() >= Porcos.LIMITE_PESO_ABATE) {
    			System.out.println("PORCO ALIMENTADO!");
    			System.out.println("PORCO: " + porco.id + " - Peso ideal para abate, animal vendido!");
    			this.vendasPorcos += porco.calcularPrecoEstimado();
    			this.rendaDaFazenda += this.vendasPorcos;
    			animais.remove(animal);
    		}
    	} else if(animal instanceof Vacas) {
    		System.out.println("VACA ALIMENTADA!");
    	}
    }
    
    //OBTENDO NÚMERO DE ANIMAIS DA FAZENDA POR CADA TIPO DE ANIMAL
    public void obterNumeroAnimais() {
    	int nGado = 0;
    	int nVacas = 0;
    	int nPorcos = 0;
    	for(Animal animal : animais) {
    		if(animal instanceof Gado) {
    			nGado++;
    		} else if(animal instanceof Porcos) {
    			nPorcos++;
    		} else if(animal instanceof Vacas) {
    			nVacas++;
    		}
    	}
    	
    	System.out.println("Nº DE GADO: " + nGado);
    	System.out.println("Nº DE VACAS: " + nVacas);
    	System.out.println("Nº DE PORCOS: " + nPorcos);
    }
    
    //OBTENDO NÚMERO DE FUNCIONÁRIOS NA FAZENDA
    public void obterNumeroFuncionarios() {
    	int nExtratores = 0;
    	int nTratadores = 0;
    	int nGerente = 0;
    	
    	for(Funcionarios funcionario : funcionarios) {
    		if(funcionario instanceof TratadorAnimais) {
    			nTratadores++;
    		} else if(funcionario instanceof ExtratorLeite) {
    			nExtratores++;
    		} else if(funcionario instanceof Gerente) {
    			nGerente++;
    		}
    	}
    	System.out.println("Nº DE TRATADORES DE ANIMAIS: " + nTratadores);
    	System.out.println("Nº DE EXTRATORES DE LEITE: " + nExtratores);
    	System.out.println("Nº DE GERENTES: " + nGerente);
    }
	
    //RETORNANDO SALÁRIO DO FUNCIONÁRIO DA FAZENDA
    public String salarioFuncionario() {
    	for(Funcionarios funcionario : funcionarios) {
    		if(funcionario instanceof TratadorAnimais) {
    			return funcionario.SalarioFuncionario();
    		} else if(funcionario instanceof ExtratorLeite) {
    			return funcionario.SalarioFuncionario();
    		} else if(funcionario instanceof Gerente) {
    			return funcionario.SalarioFuncionario();
    		}
    	}
    	return "";
    }
    
    //VERIFICANDO PESO DOS ANIMAIS DE ANIMAIS PARA ABATE
	public void verificarPeso(Animal animal) {
			//SE O ANIMAL ESTIVER NO LIMITE OU ACIMA DO PESO PARA ABATE, ELE SERÁ VENDIDO
			if(animal instanceof Gado) {
				Gado gado = (Gado) animal;
				if(gado.peso() >=  Gado.LIMITE_PESO_ABATE) {
					System.out.printf("Peso do gado: %.2f Kg%n", gado.peso());
					System.out.println("GADO: " + gado.id + " - Peso ideal para abate, animal vendido!");
					this.vendasGado += gado.calcularPrecoEstimado();
					this.rendaDaFazenda += vendasGado;;
					animais.remove(animal);
				} else {
					System.out.println("GADO: " + gado.id + " - Peso abaixo do limite para abate!");
				}
			//SE O ANIMAL ESTIVER NO LIMITE  OU ACIMA DO PESO PARA ABATE, ELE SERÁ VENDIDO
			} else if(animal instanceof Porcos) {
				Porcos porco = (Porcos) animal;
				if(porco.peso() >= Porcos.LIMITE_PESO_ABATE) {
					System.out.printf("Peso do porco: %.2f Kg%n", porco.peso());
					this.vendasPorcos += porco.calcularPrecoEstimado();
					this.rendaDaFazenda += vendasPorcos;
					System.out.println("Peso ideal para abate, animal vendido!");
					animais.remove(animal);
				}
			}	
	}
	
	//VALORES DAS VENDAS DA FAZENDA E SEU LUCRO TOTAL
	public void registro(){
		System.out.printf("Vendas de leite: R$ %.2f%n", this.vendasLitrosLeite);
		System.out.printf("Vendas de Gado: R$ %.2f%n", this.vendasGado);
		System.out.printf("Vendas de Porcos: R$ %.2f%n", this.vendasPorcos);
		System.out.printf("Fazenda geral: R$ %.2f%n", this.rendaDaFazenda);
	}
	
	//CALCULANDO SITUAÇÃO FINANCEIRA
	public void calcularSituacaoFinanceira() {
        double despesaFolhaPagamento = calcularDespesaFolhaPagamento();
        double totalArrecadado = vendasGado + vendasPorcos + vendasLitrosLeite;

        double situacaoFinanceira = totalArrecadado - despesaFolhaPagamento;

        System.out.printf("Situação financeira atual da fazenda: R$ %.2f%n", situacaoFinanceira);
    }

	//CALCULANDO DESPESAS DA FOLHA DE PAGAMENTO
    private double calcularDespesaFolhaPagamento() {
        double despesa = 0.0;

        for (Funcionarios funcionario : funcionarios) {
            if (funcionario instanceof TratadorAnimais || funcionario instanceof ExtratorLeite || funcionario instanceof Gerente) {
                despesa += funcionario.salario();
            }
        }

        return despesa;
    }
	
}
