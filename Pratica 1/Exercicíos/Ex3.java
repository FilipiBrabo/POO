public class Ex3{
	public static void main(String[] args){
		int num = 25;
		String numBin;
		
		numBin = convertePraBin(25);
		System.out.println(numBin);
		
	}
	
	public static String convertePraBin(int num){
		if (num/2 <= 0) 
			return (char)(num%2 + 48);
		
		return convertePraBin(num/2) + (char)(num%2 + 48);
	}
}