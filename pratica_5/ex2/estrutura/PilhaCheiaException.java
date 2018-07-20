package estrutura;

public class PilhaCheiaException extends PilhaException{
	private int limite;
	private Object elemento;

	public PilhaCheiaException(Object ele, int lim) {
		super("Pilha cheia");
		this.limite = lim;
		this.elemento = ele;	

	}

	public int getLimite() {
		return this.limite;
	}

	public Object getItem() {
		return this.elemento;
	}
}