import java.util.Scanner;

public class Conta {

		private int balanco;
		private int transacaoPassada;
		private String Nome;
		private String id;
		
		public Conta (String Nome, String id) {
			Nome = this.Nome;
			id = this.id;
		}
		
		void deposito(int quantidade)
		{
			if(quantidade != 0) {
				balanco += quantidade;
				transacaoPassada = +quantidade;
			}
		}
		void saca(int quantidade) {
			if(quantidade != 0 ) {
				balanco  -= quantidade;
				transacaoPassada = -quantidade;
			}
		}
		public String getNome() {
			return Nome;
		}
		public String getId() {
			return id;
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
						System.out.println("Balanço : " + balanco);
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
						System.out.println("Transação passsada: " + transacaoPassada);
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





