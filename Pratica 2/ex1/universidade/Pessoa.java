package universidade;

public class Pessoa {
    private String nome = "";
    private String cpf = "";

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void print(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF:" + getCpf());
        System.out.println();
    }
   
}