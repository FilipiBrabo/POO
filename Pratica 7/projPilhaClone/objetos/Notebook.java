package objetos;

public class Notebook extends Eletronico {
    private int numUSB;
    
    public Notebook(String serial, int numUSB) {
        super(serial);
        this.setNumUSB(numUSB);
    }

    public Notebook(Notebook a) {
        super(a.getSerial());
        this.setNumUSB(a.numUSB);
    }

    public void setNumUSB(int numUSB) {
        this.numUSB = numUSB;
    }

    public int getNumUSB() { 
        return this.numUSB;
    }

    @Override
    public String toString() {
        return "Notebook - " + getSerial() + " - " + getNumUSB();
    }
}