package geometria;

public class Circulo extends FiguraPlana{

	private double raio = 0;

	public Circulo(double raio){
		this.raio = raio;
	}

	public double getRaio(){
		return this.raio;
	}

	@Override
	public double perimetro(double raio){
		return 2*3.14*this.raio;
	}
	
}
