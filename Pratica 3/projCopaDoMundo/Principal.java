import copadomundo.*;

public class Principal{
	public static void main(String[] args){
		try{
			TimeDeFutebol ABC = new TimeDeFutebol("ABC");
			Jogador j1 = new Atacante(10);
			Jogador j2 = new Goleiro(1);
			Jogador j3 = new Lateral(3, "Direito");
			ABC.adicionaJogador(j1);
			ABC.adicionaJogador(j2);
			ABC.adicionaJogador(j3);
			
			TimeDeFutebol DEF = new TimeDeFutebol("DEF");
			Jogador j4 = new Atacante(11);
			Jogador j5 = new Goleiro(99);
			Jogador j6 = new Lateral(45, "Esquerdo");
			DEF.adicionaJogador(j4);
			DEF.adicionaJogador(j5);
			DEF.adicionaJogador(j6);
			
			ABC.imprimeEscalacao();
			DEF.imprimeEscalacao();
		}catch(Exception e){
			System.out.println("Deu ruim");
			System.out.println(e);
		}
	}
	
}