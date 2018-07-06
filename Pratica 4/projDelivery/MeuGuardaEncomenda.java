public class MeuGuardaEncomenda implements GuardaEncomenda {
  private Encomenda[] encomendas = new Encomenda[1000];
  private int size = 0;
  public void adiciona(Encomenda e) {
    boolean adicionou = false;
    boolean temIgual = false;

    for (int i = 0; i < encomendas.length && !adicionou &&
      !temIgual; i++) {
        if (encomendas[i] != null) {
          if (e.compareTo(encomendas[i]) == 0)
            temIgual = true;
        }else {
          encomendas[i] = e;
          adicionou = true;
          size++;
        }
      }
  }

  public int getSize() {
    return size;
  }

  public void ordena() {
    selectionSort();
  }

  private void selectionSort() {
    int indiceMenor;

    for (int i = 0; i < getSize() - 2; i++) {
      indiceMenor = i;
      for (int j = i + 1; j < getSize() - 1; j++) {
        if (encomendas[j].compareTo(encomendas[indiceMenor]) == -1)
          indiceMenor = j;
      }
      troca(indiceMenor, i);
    }
  }

  private void troca(int i, int j) {
    Encomenda tmp = encomendas[i];

    encomendas[i] = encomendas[j];
    encomendas[j] = tmp;
  }

  @Override
  public String toString() {
    String ret = "";
    for (int i = 0; i < getSize() - 1; ++i) {
      ret = ret + encomendas[i] + ", ";
    }
    return ret;
  }


}
