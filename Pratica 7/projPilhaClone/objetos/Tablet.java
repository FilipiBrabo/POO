package objetos;

public class Tablet extends Eletronico {
    
    public Tablet(String serial) {
        super(serial);        
    }

    public Tablet(Tablet a) {
        super(a.getSerial());
    }

    @Override
    public String toString() {
        return "Tablet - " + getSerial();
    }
}