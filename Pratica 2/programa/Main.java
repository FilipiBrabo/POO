package programa;
import estruturas.ListaLigada;

public class Main{
	public static void main(String[] args){
		ListaLigada lista = new ListaLigada();
		boolean flag;
		
		lista.adicionaNoFinal(0);
		lista.adicionaNoFinal(1);
		lista.adicionaNoFinal(2);
		lista.adicionaNoFinal(78);
		lista.adicionaNoFinal(5);		
		lista.imprimeLista();
		
		lista.insereOrdenado(3);
		lista.insereOrdenado(-1);
		lista.insereOrdenado(97);
		lista.insereOrdenado(4);
		lista.imprimeLista();
		/*
		imprimeFlag(lista.buscaItem(0));
		lista.removeItem(0);		
		lista.imprimeLista();
		imprimeFlag(lista.buscaItem(0));
		
		lista.removeItem(5);
		lista.imprimeLista();
		imprimeFlag(lista.buscaItem(78));
		*/
		
		
	}
	
	public static void imprimeFlag(boolean flag){
		if (flag == true){
			System.out.println("O item esta na lista");
		} else {
			System.out.println("O item nao esta na lista");
		}
	}
}