import java.util.Random;

public class CobradorComputador extends Jogador implements ICobradorStrategy {
    
    public CobradorComputador() {
        super("Computador");
    }
    
    @Override
    public int chutar() {
        Random rd = new Random();
        return rd.nextInt(2) + 1;
    }
}