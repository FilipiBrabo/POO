import java.util.Scanner;
public class Chocolate2{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		int m = ler.nextInt();
		int[][] matriz = new int[n][m];		
		
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[0].length; j++){
				matriz[i][j] = ler.nextInt();
			}
		}
		
		imprimeMatriz(matriz);
		
		int dia = ler.nextInt(); //total
		int mes = ler.nextInt(); //comprimento
		
		System.out.println(contaSegmentos(matriz, mes, dia));	
		
	}
	
	
	public static int contaSegmentos(int[][] matriz, int comprimento, int total){
		int soma = 0;
		int cont = 0;
		int z = 0;
		
		//Verifica linhas
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[0].length; j++){
				for (z = 0; z < comprimento && (z+j) < matriz[0].length; z++)
					soma += matriz[i][z+j];
				if (soma == total && z == comprimento)
					cont++;
				soma = 0;
			}			
		}
		
		//Verifica colunas
		for (int j = 0; j < matriz[0].length; j++){
			for (int i = 0; i < matriz.length; i++){
				for (z = 0; z < comprimento && (z+i) < matriz.length; z++)
					soma += matriz[z+i][j];
				if (soma == total && z == comprimento)
					cont++;
				soma = 0;
			}			
		}
		
		return cont;
	}
	
	public static void imprimeMatriz(int[][] matriz){
		System.out.printf("------------------------\n");
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[0].length; j++)
				System.out.printf(matriz[i][j] + " ");
			System.out.println();
		}
		System.out.printf("------------------------\n");
	}
}