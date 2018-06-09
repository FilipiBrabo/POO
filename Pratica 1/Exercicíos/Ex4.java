public class Ex4{
	public static void main(String[] args){
		int n = 11;
		
		primosMenores(n);
	}
	
	public static void primosMenores(int n){
		int v[] = new int[n+1];
		
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
			if (v[i] != 0)
				System.out.printf(v[i] + " ");			
		}
		System.out.println();
	}
}