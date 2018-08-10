package objetos;

public abstract class Eletronico implements Cloneable{
    private String serial;

    public Eletronico(String serial) {
        this.setSerial(serial);
    }

    public String getSerial() {
        return this.serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Eletronico clone() throws CloneNotSupportedException {
        return (Eletronico) super.clone();
    }
}