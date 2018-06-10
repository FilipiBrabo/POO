public class Ex4{
	public static void main(String[] args){
		int n = 1000;
		
		primosMenores(n);
	}
	
	public static void primosMenores(int n){
		int v[] = new int[n+1];
		int cont = 0;
		
		for (int i = 0; i < v.length; i ++){
			v[i] = i;
		}
		
		for (int i = 2; i < v.length; i++){
			for (int j = i + 1; j < v.length; j++){
				if (j%i == 0)
					v[j] = 0;
			}
		}
		
		for (int i = 2; i < v.length; i ++){
			if (v[i] != 0){
				if (cont > 9){
					System.out.println();
					cont = 0;
				}
				System.out.printf(v[i] + " ");	
				cont++;
			}
		}
		System.out.println();
	}
}