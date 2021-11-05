package entities;

import java.util.Scanner;

public class Menu {
	
	public void start() {
		System.out.println("EScolha uma Opção");
		System.out.println("1: Adicionar Funcionário");
		System.out.println("2: Remover Funcionário");
		System.out.println("3: Lançar Cartão de Ponto");
		System.out.println("4: Lançar Resultado venda");
		System.out.println("5: Lançar Taxa de Serviço");
		System.out.println("6: Atualizar Dados do Funcionário");
		System.out.println("7: Rodar Hoje ");
		System.out.println("8: Undo/Redo");
		System.out.println("9: Agenda de Pagamentos");
		System.out.println("10: Criar Agenda de Pagamento");
		System.out.println("11: Sair");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 int opcao = sc.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Opção 1 apertada");
			break;
		case 2:
			System.out.println("Opção 2 apertada");
			break;
		case 3:
			System.out.println("Opção 3 apertada");
			break;
		case 4:
			System.out.println("Opção 4 apertada");
			break;
		case 5:
			System.out.println("Opção 5 apertada");
			break;
		case 6:
			System.out.println("Opção 6 apertada");
			break;
		case 7:
			System.out.println("Opção 7 apertada");
			break;
		case 8:
			System.out.println("Opção 8 apertada");
			break;
		case 9:
			System.out.println("Opção 9 apertada");
			break;
		case 10:
			System.out.println("Opção 10 apertada");
			break;
		case 11:
			System.out.println("Opção 11 apertada");
			break;
		default: 
			System.out.println("Opção inválida");
			break;
		}}
	
	
}

