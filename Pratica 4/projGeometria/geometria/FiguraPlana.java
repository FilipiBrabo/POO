package geometria;

public abstract class FiguraPlana {

	protected String tipo = "";

	// public FiguraPlana(String tipo){
	// 	this.tipo = tipo;
	// }

	public abstract double perimetro();

	public abstract double area();

	public String toString(){
		return "Obj: "+tipo+ ", Area: " +area()+ ", Perimetro: " +perimetro();
	}
}
