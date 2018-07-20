package estrutura;

public class PilhaRecurso extends PilhaAprimorada implements AutoCloseable{

	public PilhaRecurso(int tamanhoMax) {
		super(tamanhoMax);
	}

	@Override 
	public void close() {
		while (getTopo() > -1)
		desempilha();
	}

	@Override
	public String toString() {
		return "Item " + getTopo() + 1 + "removido";
	}
}
