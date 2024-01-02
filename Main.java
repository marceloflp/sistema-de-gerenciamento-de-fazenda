package fazenda;

public class Main {

	public static void main(String[] args) {
		Gado gado1 = new Gado(123, 8, 302.2);
		Gado gado2 = new Gado(1234, 9, 301.2);
		Gado gado3 = new Gado(12345, 8, 602.2);
		
		Porcos porco1 = new Porcos(321, 6, 99.0);
		Porcos porco2 = new Porcos(4321, 3, 98.5);
		
		Vacas vaca = new Vacas(4321, 4, 210.0);
		Vacas vaca2 = new Vacas(54321, 3, 217.0);
		
		ExtratorLeite extrator1 = new ExtratorLeite("Oswaldo", 24, 643928492);
		Funcionarios extrator2 = new ExtratorLeite("Caio", 32, 34545534); //POLIMORFISMO
		
		Funcionarios gerente = new Gerente("Felipe", 31, 5345345); //POLIMORFISMO
		
		Funcionarios tratador = new TratadorAnimais("Daniel", 45, 32452423); //POLIMORFISMO
		Funcionarios tratador2 = new TratadorAnimais("Carlos", 42, 245243211); //POLIMORFISMO
		
		Fazenda fazenda = new Fazenda();
		
		fazenda.infoFazenda(); //INFORMAÇÕES SOBRE A FAZENDA
		System.out.println("--------------------------------------------------");
		
		//ADICIONADO ANIMAIS NA FAZENDA
		fazenda.adicionarAnimal(gado1);
		fazenda.adicionarAnimal(gado2);
		fazenda.adicionarAnimal(gado3);
		fazenda.adicionarAnimal(porco1);
		fazenda.adicionarAnimal(porco2);
		fazenda.adicionarAnimal(vaca);
		fazenda.adicionarAnimal(vaca2);
		
		//ANIMAIS EMITINDO SONS
		gado1.emitirSom();
		porco1.emitirSom();
		vaca.emitirSom();
		System.out.println("--------------------------------------------------");
		
		fazenda.obterNumeroAnimais(); //OBTENDO O NÚMERO DE ANIMAIS NA FAZENDA
		System.out.println("--------------------------------------------------");
		
		//ADCIONANDO FUNCIONÁRIOS NA FAZENDA
		fazenda.adicionarFuncionario(extrator1);
		fazenda.adicionarFuncionario(extrator2);
		fazenda.adicionarFuncionario(gerente);
		fazenda.adicionarFuncionario(tratador);
		fazenda.adicionarFuncionario(tratador2);
		
		fazenda.obterNumeroFuncionarios(); //OBTENDO O NÚMERO DE FUNCIONÁRIOS NA FAZENDA
		System.out.println("--------------------------------------------------");
		
		fazenda.extrairLeite(extrator2, vaca); //EXTRATOR RETIRANDO LEITE DA VACA
		System.out.println("--------------------------------------------------");
		
		System.out.printf("R$: %.2f\n" ,extrator2.calcularSalario(12)); //CALCULANDO VALOR DO SALÁRIO DO FUNCIONÁRIO APÓS VENDA DE 	R$12 EM LEITE
		System.out.println("--------------------------------------------------");
		
		fazenda.verificarPeso(gado1); //VERIFICANDO PESO DO GADO
		fazenda.verificarPeso(gado3); //VERIFICANDO PESO DO GADO PRONTO PARA O ABATE
		System.out.println("--------------------------------------------------");
		
		fazenda.alimentar(porco1); //ALIMENTANDO UM ANIMAL (PORCO) E VENDENDO-O EM SEGUINDA
		System.out.println("--------------------------------------------------");
		
		fazenda.obterNumeroAnimais(); //OBTENDO NÚMERO DE ANIMAIS ATUALIZADA
		System.out.println("--------------------------------------------------");
		
		fazenda.calcularPrecoEstimadoAnimal(gado2); //CALCULANDO VALOR DO ANIMAL PARA VENDA COM SEU PESO ATUAL
		System.out.println("--------------------------------------------------");
		
		fazenda.removerFuncionario(tratador2); //REMOVENDO FUNCIONÁRIO DA FAZENDA
		
		extrator1.exibirEstado(); //EXIBINDO INFORMAÇÕES SOBRE O FUNCIONÁRIO
		System.out.println("--------------------------------------------------");
		
		gado1.estado(); //EXIBINDO INFORMAÇÕES SOBRE O ANIMAL
		System.out.println("--------------------------------------------------");
		
		fazenda.registro(); //OBTENDO REGISTRO DAS VENDAS DA FAZENDA
		System.out.println("--------------------------------------------------");
		
		fazenda.extrairLeite(extrator2, vaca2);//EXTRATOR RETIRANDO LEITE DA VACA
		System.out.println("--------------------------------------------------");
		
		System.out.println(extrator2.SalarioFuncionario()); //OBTENDO O SALÁRIO DO FUNCIONÁRIO COM O PERCENTUAL DO LEITE VENDIDO
		System.out.println("--------------------------------------------------");
		
		System.out.println(gado1.pesoEmQuilo()); //VERIFICANDO PESO DO ANIMAL EM QUILO
		System.out.println(gado1.converterParaArroba()); //VERIFICANDO PESO DO ANIMAL EM ARROBA
		System.out.println("--------------------------------------------------");
		
		fazenda.calcularSituacaoFinanceira(); //CALCULANDO SITUAÇÃO FINANCEIRA DA FAZENDA
		
	}

}
