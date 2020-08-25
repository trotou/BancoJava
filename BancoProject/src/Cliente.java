import java.util.Scanner;

public class Cliente extends Conta {
	private String Nome;
	private String id;

	public Cliente( String Nome, String id) {
		this.Nome = Nome;
		this.id = id;
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo "+ this.Nome);
		System.out.println("Sua identidade é "+ this.id);
		System.out.println("\n");
		System.out.println("A. Checar balanço");
		System.out.println("B. Depositar");
		System.out.println("C. Sacar");
		System.out.println("D. Transações passadas");
		System.out.println("E. Sair");
		
		do {
			System.out.println("============================================");
			System.out.println("Escolha uma opção");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
				case 'A':
					System.out.println("-------------------------------------");
					System.out.println("Balanço : " + getBalanco());
					System.out.println("-------------------------------------");
					System.out.println("\n");
					break;
				case 'B':
					System.out.println("-------------------------------------");
					System.out.println("Informe o valor a ser depositado:");
					System.out.println("-------------------------------------");
					int quantidade = scanner.nextInt();
					deposito(quantidade);
					System.out.println("\n");
					break;
				case 'C':
					System.out.println("---------------------------------------");
					System.out.println("Informe a quantia que deverá ser sacada:");
					System.out.println("----------------------------------------");
					int quantidade2 = scanner.nextInt();
					saca(quantidade2);
					System.out.println("\n");
					break;
				case 'D':
					System.out.println("---------------------------------------");
					System.out.println("Transação passsada: " + getTransacaoPassada());
					System.out.println("----------------------------------------");
					System.out.println("\n");
					break;
				case 'E':
					System.out.println("-------------------------------------");
					System.out.println("\n");
					break;
				default:
					System.out.println("Letra invalida. Tente novamente!");
					break;
			}
			
		}while(option != 'E');
		
		System.out.println("Obrigado por usar nossos serviços!");
	}

}
