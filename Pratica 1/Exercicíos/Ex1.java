public class PI{
	public static void main(String[] args){
		double soma = 0, pi = 0;;
		int numeroTermos = 10000;
		int sinal = -1;
		
		for (int i = 1; i < numeroTermos; i+=2){
			sinal *= -1;
			soma += sinal*(1.0/i);
		}
		
		pi = 4*soma;
		
		System.out.println(pi);
	}
}