package geometria;

public class Poligono extends FiguraPlana{

	protected double[] lados = null;

	@Override
	public double perimetro(){
		double soma = 0;
		
		if (lados != null)
			for(double e: lados)
				soma += e;
		return soma;
	}
}