public class Conta {
	private String nome;
	private int saldo;
	private int limite;

	public Conta(String nome) {
		this.nome = nome;
		setSaldo(0);
		setLimite(0);
	}

	public void depositar(int qtd) {		
		setSaldo(qtd);
	}

	public void sacar(int qtd) throws SaldoInsuficienteException {
		if (qtd <= this.saldo + this.limite) {
			this.saldo -= qtd;
		} else {
			throw new SaldoInsuficienteException(getLimite() + getSaldo());
		}
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int qtd) {
		this.saldo += qtd;
	} 

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setLimite(int qtd) {
		this.limite = qtd;
	}

	public int getLimite(){
		return this.limite;
	}

	@Override
	public String toString() {
		return this.getNome() + "tem " + this.getSaldo();
	}	
}