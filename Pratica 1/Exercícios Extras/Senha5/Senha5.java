import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Senha5{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome do arquivo de entrada(precisa do path caso nao esteja no mesmo folder");
		String nomeInput = leitor.nextLine();		
		
		try{
			FileReader arq = new FileReader(nomeInput);
			BufferedReader lerArq = new BufferedReader(arq);
			
			String s = lerArq.readLine();
			while (s != null){
				if (validaSenha(s)){
					System.out.println("Senha valida.");
				}else{
				System.out.println("Senha invalida.");
				}
				
				s = lerArq.readLine();
			}
				
			arq.close();
		
		}catch (IOException e){
			System.err.printf("%s", e.getMessage());
		}			
	}
	
	public static boolean validaSenha(String s){
		boolean flagNumero = false;
		boolean flagMaiusculo = false;
		boolean flagMinusculo = false;
		boolean flagEspecial = false;		
		char c;
		
		if (s.length() < 6 || s.length() > 32)
			return false;
		
		for (int i = 0; i < s.length(); i++){
			c = s.charAt(i);
			if (c > 47 && c < 58){
				flagNumero = true;
			
			}else if (c > 64 && c < 91){
				flagMaiusculo = true;
			
			}else if (c > 96 && c < 123){
				flagMinusculo = true;
			
			}else{
				flagEspecial = true;
			}
		}

		if (flagEspecial)
			return false;
		if (flagMaiusculo && flagMinusculo && flagNumero)
			return true;
		
		return false;
	}
	
}