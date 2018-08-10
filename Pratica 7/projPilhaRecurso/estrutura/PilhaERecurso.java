package estrutura;

public class PilhaERecurso extends PilhaE implements AutoCloseable{

    public PilhaERecurso(int tam) {
        super(tam);
    }
    @Override
    public void close() {
        int qtdItens = 0;
        while (getTopo() != -1) {
            this.desempilha();
            qtdItens ++;
        }
        System.out.println("Pilha foi esvaziada! Tinha " + qtdItens + " itens.");
    }
}