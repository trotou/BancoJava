
public class Conta {

		private int balanco;
		private int transacaoPassada;		
		
		void deposito(int quantidade)
		{
			if(quantidade != 0) {
				setBalanco(getBalanco() + quantidade);
				setTransacaoPassada(+quantidade);
			}
		}
		void saca(int quantidade) {
			if(quantidade != 0 ) {
				setBalanco(getBalanco() - quantidade);
				setTransacaoPassada(-quantidade);
			}
			
		}
		public int getBalanco() {
			return balanco;
		}
		public void setBalanco(int balanco) {
			this.balanco = balanco;
		}
		public int getTransacaoPassada() {
			return transacaoPassada;
		}
		public void setTransacaoPassada(int transacaoPassada) {
			this.transacaoPassada = transacaoPassada;
		}
		
}

		







