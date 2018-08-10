package objetos;

public class NotebookGrande extends Notebook {
    public NotebookGrande(String serial) {
        super(serial, 25);
    }

    public NotebookGrande(NotebookGrande a){
        super(a.getSerial(), 25);
    }

    @Override
    public String toString() {
        return "NotebookGrande - " + getSerial() + " - " + getNumUSB();
    }
}