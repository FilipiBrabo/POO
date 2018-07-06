import geometria.*;

public class Programa{

	public static void main(String[] args){

		try{
			FiguraPlana a1 = new Quadrado(9);
			FiguraPlana a2 = new Retangulo(10,9);
			FiguraPlana a3 = new Triangulo(3,4,5);

			System.out.println(a1);
			System.out.println(a3);
			System.out.println(a2);

		}catch(Exception e){
			System.out.println(e);
		}
	}
}
