public class Treino {

	public static void main(String[] args) {

		Jogador[] jogadores = inicializaJogadores(args[0], args[1]);
		Jogador cobrador = jogadores[0];
		Jogador goleiro = jogadores[1];
		
		Penalty p = new Penalty(goleiro, cobrador);
		
		int acertosCobrador = 0;
		int defesas = 0;
		
		for (int i = 0; i < 3; i++)
			if (p.cobrar())
				acertosCobrador++;
			else
				defesas++;
			
		System.out.println("[" + ((Jogador) cobrador).getNome() + "] Gols = " + acertosCobrador 
						+ "  [" + ((Jogador) goleiro).getNome() + "] Defesas = " + defesas);
	}

	private static Jogador[] inicializaJogadores(String tipoCobrador, String tipoGoleiro) {
		if (tipoCobrador.equals("P")) {
			Jogador[0] = new CobradorPessoa("Saul");
		} else {
			Jogador[0] = new CobradorComputador();
		}

		if (tipoGoleiro.equals("P")) {
			Jogador[1] = new GoleiroPessoa("Paulo");
		} else {
			Jogador[1] = new GoleiroComputador();
		}
	}
}