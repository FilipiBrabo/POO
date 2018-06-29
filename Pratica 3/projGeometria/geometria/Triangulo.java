package geometria;

public class Triangulo extends Poligono{

	public Triangulo(double lado1, double lado2, double lado3) throws Exception{

		if (lado1 <=0 || lado2 <= 0 || lado3 <=0 || 
			lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 ||
			lado3 + lado1 <= lado2){
			throw new Exception("Não Forma um Triangulo");
		}

		lados = new double[3];
		lados[0] = lado1;
		lados[1] = lado2;
		lados[2] = lado3;
		tipo = "triangulo";
	}

	//@Override
	public double area (double[] lados){
		return 90;
	}
}