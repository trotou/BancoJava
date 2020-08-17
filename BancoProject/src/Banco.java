import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		

	}

}


class BancoConta
{	
	int balanco;
	int transacaoPassada;
	String Nome;
	String id;
	
	void deposito(int quantidade)
	{
		if(quantidade != 0) {
			balanco += quantidade;
			transacaoPassada = quantidade;
		}
	}
	void saca(int quantidade) {
		if(quantidade != 0 ) {
			balanco -= quantidade;
			transacaoPassada = -quantidade;
		}
	}
	void gettransacaoPassada() {
		if(transacaoPassada > 0) {
			System.out.println("Depositou " + transacaoPassada);
		}
		else if( transacaoPassada < 0) {
			System.out.println("Sacou " + Math.abs(transacaoPassada));
		}
		else {
			System.out.println("Não houve transferências");
		}
			
	}
}