import java.util.Scanner;

public class Soremun{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		
		int num = leitor.nextInt();
		
		int numInvertido = inverteNum(num);
		
		System.out.println(numInvertido);
		
	}
	
	public static int inverteNum(int num){
		int numInvertido = 0;
		
		for (int i = 1000; i > 0; i /= 10){
			numInvertido += num%10 * i;
			num = num/10;
		}

		return numInvertido;
	}
}