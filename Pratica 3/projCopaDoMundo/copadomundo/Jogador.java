package copadomundo;

public class Jogador{
	private int numCamisa = -1;
	protected String pos = "";
	
	
	public Jogador(int numCamisa){
		this.numCamisa = numCamisa;
	}	
	
	public String getPos(){
		return this.pos;
	}
	
	public int getNumCamisa(){
		return this.numCamisa;
	}
	
	public void setNumCamisa(int num){
		this.numCamisa = num;
	}
}