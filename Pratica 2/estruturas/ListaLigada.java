package estruturas;

public class ListaLigada {
	private class LinkedNode {
		int data = 0;
		LinkedNode next = null;
	}
	
	LinkedNode first = null;
	
	public void adicionaNoFinal(int item) {
		//Criar novo nó
		LinkedNode no = new LinkedNode();
		no.data = item;

		if (this.first == null) {
			this.first = no;
		} else {
			LinkedNode atual = this.first;
			while (atual.next != null) {
				atual = atual.next;
			}
			atual.next = no;
		}
	}
	
	public void imprimeLista() {
		for (LinkedNode atual = this.first; atual != null; atual = atual.next) 
			System.out.printf(atual.data + " ");

		System.out.println();
	}
	
	//Remove o primeiro nó contendo o item
	public void removeItem(int item) {
		LinkedNode anterior = null;
		LinkedNode atual = this.first;
		
		while(atual != null && atual.data != item) {
			anterior = atual;
			atual = atual.next;
		}
		
		if (atual != null) {
			if (anterior == null) {
				this.first = atual.next;
			} else {
				anterior.next = atual.next;  
			}
		}		
	}
	
	public boolean buscaItem(int item) {
		LinkedNode atual = first;
		for (; atual != null && atual.data != item; atual = atual.next);
		
		if (atual == null)
			return false;
		
		return true;
	}
	
	public void insereOrdenado(int item) {
		LinkedNode no = new LinkedNode();
		no.data = item;
		
		if (this.first == null) {
			this.first = no;
		} else {
			LinkedNode atual = first;
			LinkedNode anterior = null;
			while (atual != null && atual.data < item) {
				anterior = atual;
				atual = atual.next;
			}
			if (anterior == null){
				no.next = this.first;
				this.first = no;
			} else {
				anterior.next = no;
				no.next = atual;
			}
		}
	}
}