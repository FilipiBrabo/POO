public interface GuardaEncomenda {
  void adiciona(Encomenda e); //adiciona uma nova encomenda (não aceita duplicada)

  int getSize();
  void ordena();

}
