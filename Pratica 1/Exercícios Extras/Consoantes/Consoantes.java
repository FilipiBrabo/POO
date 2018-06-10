import java.util.Scanner;
public class Consoantes{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		char c;
		int contTotal = 0, contVogal = 0;;
		
		c = ler.nextLine().charAt(0);
		while (c != '*'){
			if (c > 64 && c < 91)
				contVogal++;
			contTotal++;
		c = ler.nextLine().charAt(0);
		}
		
		System.out.println(contTotal - contVogal);
	}
}