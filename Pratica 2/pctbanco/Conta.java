package pctbanco;

public class Conta {
    private int id = 0;
    private double saldo = 0;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimirSaldo(){
        System.out.println("ID: " + getId());
        System.out.printf("Saldo: %.2f\n", getSaldo());
        System.out.println();
    }

    public void addSaldo(double valor){
        this.saldo = getSaldo() + valor; 
    } 
}