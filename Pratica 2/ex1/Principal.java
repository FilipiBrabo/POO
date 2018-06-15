import universidade.*;

public class Principal{ 

    public static void main(String[] args){
        Pessoa a = new Pessoa();
        Pessoa b = new Pessoa();

        a.setNome("Bryan");
        a.setCpf("142.154.124.65");
        b.setNome("Bigode");
        b.setCpf("145.789.546.98");

        a.print();
        b.print();
    }
}