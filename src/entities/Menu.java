package entities;

import java.util.Scanner;

public class Menu {
	
	public void start() {
		System.out.println("EScolha uma Op��o");
		System.out.println("1: Adicionar Funcion�rio");
		System.out.println("2: Remover Funcion�rio");
		System.out.println("3: Lan�ar Cart�o de Ponto");
		System.out.println("4: Lan�ar Resultado venda");
		System.out.println("5: Lan�ar Taxa de Servi�o");
		System.out.println("6: Atualizar Dados do Funcion�rio");
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
			System.out.println("Op��o 1 apertada");
			break;
		case 2:
			System.out.println("Op��o 2 apertada");
			break;
		case 3:
			System.out.println("Op��o 3 apertada");
			break;
		case 4:
			System.out.println("Op��o 4 apertada");
			break;
		case 5:
			System.out.println("Op��o 5 apertada");
			break;
		case 6:
			System.out.println("Op��o 6 apertada");
			break;
		case 7:
			System.out.println("Op��o 7 apertada");
			break;
		case 8:
			System.out.println("Op��o 8 apertada");
			break;
		case 9:
			System.out.println("Op��o 9 apertada");
			break;
		case 10:
			System.out.println("Op��o 10 apertada");
			break;
		case 11:
			System.out.println("Op��o 11 apertada");
			break;
		default: 
			System.out.println("Op��o inv�lida");
			break;
		}}
	
	
}

