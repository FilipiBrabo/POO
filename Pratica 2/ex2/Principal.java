import pctbanco.*;

public class Principal {
    
    public static void main(String[] args) {
        /*
        Conta a = new Conta();
        Conta b = new Conta();

        a.setId(1);
        a.setSaldo(100.89);

        a.setId(2);
        a.setSaldo(10);

        a.imprimirSaldo();
        b.imprimirSaldo();
        */
        Banco banco = new Banco();
        int c1 = banco.abrirConta(100.50);
        int c2 = banco.abrirConta(50);
        int c3 = banco.abrirConta(30); 

        banco.transacao(c1, 70.50);
        banco.transacao(c2, -50000000.50);
        banco.transacao(c3, 80.56);

        banco.saldo(c1);
        banco.saldo(c2);
        banco.saldo(c3);

    }
}