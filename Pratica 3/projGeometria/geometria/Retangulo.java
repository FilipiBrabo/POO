package geometria;

public class Retangulo extends Poligono{

	public Retangulo(double lado1, double lado2){
		lados = new double[4];
		lados[0] = lado1;
		lados[1] = lado1;
		lados[2] = lado2;
		lados[3] = lado2;

		tipo = "retangulo";
	}

	@Override
	public double area(){
		return lados[0] * lados[2]; 
	}
}