package copadomundo;

public class TimeDeFutebol {
	Jogador[] jogadores = new Jogador[11];
	private String nome = "";	
	
	
	public TimeDeFutebol(String nome){
		setNome(nome);
	}
	
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void substituirJogador(Jogador a, Jogador b){
		for (Jogador j: jogadores)
			if (j == a)
				j = b;
			
		selectionSort();
	}
	
	private void selectionSort(){
		
		for (int i = 0; i < jogadores.length - 1 && jogadores[i] != null; i++){
			int min = jogadores[i].getNumCamisa();
			
			for (int j = i + 1; j < jogadores.length && jogadores[j] != null ; j++) {
				if (jogadores[j].getNumCamisa() < min){
					min = jogadores[j].getNumCamisa();
				}
			}
			
			if (jogadores[i].getNumCamisa() != min){
				Jogador tmp = jogadores[i];
				jogadores[i] = jogadores[min];
				jogadores[min] = tmp;
			}
		}
	}
	
	
	public void imprimeEscalacao(){
		System.out.println("TIME:" + getNome());
		for (Jogador j: jogadores){
			if (j != null)
				System.out.println("Posicao: " + j.getPos() + ", Numero: " + j.getNumCamisa()); 
		}
	}
	
	public void adicionaJogador(Jogador jogadorNovo) throws Exception{
		boolean adicionouJogador = false;
		
		for (int i = 0; i < jogadores.length && !adicionouJogador; i++){
			if (jogadores[i] == null){
				jogadores[i] = jogadorNovo;
				adicionouJogador = true;
			}
		}		
		
		if (!adicionouJogador){
			throw new Exception("Nao adicionou jogador.");
		}else{
			selectionSort();
		}
		
	}
}