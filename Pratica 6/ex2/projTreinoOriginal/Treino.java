public class Treino {

	public static void main(String[] args) {

		
		ICobradorStrategy cobrador = args[0].equals("P") ? new CobradorPessoa("Saul") : new CobradorComputador();
		IGoleiroStrategy goleiro = args[1].equals("P") ? new GoleiroPessoa("Paulo") : new GoleiroComputador();
		
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
}