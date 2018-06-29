package geometria;

public class FiguraPlana {

	protected String tipo = "";

	// public FiguraPlana(String tipo){
	// 	this.tipo = tipo;
	// }

	public double perimetro(){
		return 0.0;
	}

	public double area(){
		return 0.0;
	} 

	public String toString(String tipo){
		return "Obj: "+tipo+", Area: "+area()+", Perimetro: "+perimetro();
	}
}