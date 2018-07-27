package estrutura;

public class PilhaAprimorada extends PilhaSimples {

	public PilhaAprimorada(int tamanhoMax) {
		super(tamanhoMax);
	}

	@Override
	public void empilha(Object novoItem) throws PilhaCheiaException {

		if (getTopo() + 1 == getTamanhoMax()) {
			throw new PilhaCheiaException(novoItem, getTamanhoMax());
		}  else {
			super.empilha(novoItem);
		}
	}

	@Override
	public Object desempilha() throws PilhaVaziaException{
		if (getTopo() == -1) {
			throw new PilhaVaziaException();
		} else {
			return super.desempilha();
		}
	}
}