package estrutura;

import objetos.*;

public class PilhaE implements Cloneable {

	private int topo;
	private Eletronico[] itens;
	
	public PilhaE(int tamanhoMax) {
		this.itens = new Eletronico[tamanhoMax];
		this.topo = -1;
	}
	
	public void empilha(Eletronico novoItem) {
		if (getTopo() == getTamanhoMax() - 1)
			throw new PilhaCheiaException(getTamanhoMax(), novoItem);
		
		itens[++topo] = novoItem;
	}
	
	public Eletronico desempilha() {
		// verificar pilha vazia
		if (getTopo() == -1)
			throw new PilhaVaziaException();
		
		Eletronico item = itens[topo];
		itens[topo--] = null;
		return item;
	}
	
	int getTopo() {
		return this.topo;
	}
	
	int getTamanhoMax() {
		if (itens != null)
			return this.itens.length;
		else
			return -1;
	}

	@Override
	public PilhaE clone() throws CloneNotSupportedException {
		PilhaE objClone = (PilhaE) super.clone();
		objClone.itens = itens.clone();

		for(int i = 0; i <= topo; i++) {
			objClone.itens[i] = itens[i].clone();
		}
		return objClone;
	}
	
	/*
	@Override
	public PilhaE clone() throws CloneNotSupportedException {
		int topoAux = topo;
		PilhaE pilhaCopia = new PilhaE();
		for (int i = 0; i <= topo; i++){
			if (this.itens[i] instanceof Tablet) {
				pilhaCopia.itens[i] = (Eletronico) new Tablet(this.itens[i]);
			} else if (this.itens[i] instanceof Notebook){
				pilhaCopia.itens[i] = (Eletronico) new Notebook(this.itens[i]);
			} else {
				pilhaCopia.itens[i] = (Eletronico) new NotebookGrande(this.itens[i]);

			}
		}
		return pilhaCopia;
	}
	*/
}
