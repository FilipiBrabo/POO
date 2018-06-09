/*
Insere um inteiro em uma posição i de um vetor usando
deslocamento caso i estiver ocupada, assumindo que células com
valor zero são vazias (e portanto são espaços livre que podem
ser preenchidos).
*/

public class Ex2{
	public static void main(String[] args){
		int vetor[] = {25, 14, 56, 0, 36, 56, 77, 18, 29, 49};
		
		imprimeVetor(vetor);
		insereNum(vetor, 10, 3);
		imprimeVetor(vetor);
	}
	
	public static boolean insereNum(int[] vetor, int num, int pos){
		int posZero= -1;

		for (int i = 0; i < vetor.length; i++){
			if (vetor[i] == 0){
				posZero = i;
				break;
			}
		}

		if (posZero == -1)
			return false;
		
		for (int i = posZero; i > pos; i--)
			vetor[i] = vetor[i-1];
		
		vetor[pos] = num;
		return true;
	}
	
	public static void imprimeVetor(int[] v){
		for (int e : v){
			System.out.printf(e +" ");
		}
		System.out.println();
	}
}