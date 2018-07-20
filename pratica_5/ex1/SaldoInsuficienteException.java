public class SaldoInsuficienteException extends Exception{
	
	private int saldoDisponivel;

	public SaldoInsuficienteException(int saldo ) {
		super("O saldo da conta eh insuficiente!");
		setSaldo(saldo);
	}

	public void setSaldo(int saldo) {
		this.saldoDisponivel = saldo; 
	}

	public int getSaldo() {
		return saldoDisponivel;
	}
}