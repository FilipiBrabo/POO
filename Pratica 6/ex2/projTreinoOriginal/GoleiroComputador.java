import java.util.Random;

public class GoleiroComputador extends Jogador implements IGoleiroStrategy {
    
    public GoleiroComputador() {
        super("Computador");
    }

    @Override
    public int defender() {
        Random rd = new Random();
        return rd.nextInt(2) + 1;
    }
}