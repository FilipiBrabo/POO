package pctbanco;

public class Banco{
    private Conta[] contas = new Conta[10];
    private static int id = 0;

    public int abrirConta(double deposito){
        
        this.contas[++id] = new Conta();
        this.contas[id].setSaldo(deposito);
        this.contas[id].setId(id);
        return id;
    }

    public void transacao(int id, double valor){
        double saldoFinal = this.contas[id].getSaldo() + valor; 
        
        if (saldoFinal < 0){
           System.out.println("Não é possível sacar esta quantia");
        } else{
            this.contas[id].addSaldo(valor);
        }                
    }

    public void saldo(int id){
        this.contas[id].imprimirSaldo();
    }

}