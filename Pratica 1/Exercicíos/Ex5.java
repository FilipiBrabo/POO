public class Ex5{
	public static void main(String[] args){
		int[] v = {20, 8, 6, 7, 8, 10, 22, 12, 18, 15};
		imprimeVetor(v);
		selectionSort(v);
		imprimeVetor(v);
	}
	
	public static void imprimeVetor(int[] v){
		for (int e : v)
			System.out.printf(e + " ");
		System.out.println();
	}
	
	public static void selectionSort(int v[]){
		int indMenor = 0, tmp = 0;
		
		for (int i = 0; i < (v.length - 1); i++){
			indMenor = i;
			for (int j = i+1; j < v.length; j++){
				if (v[j] <= v[indMenor])
					indMenor = j;
			}
			
			tmp = v[i];
			v[i] = v[indMenor];
			v[indMenor] = tmp;
		}	
	}
}