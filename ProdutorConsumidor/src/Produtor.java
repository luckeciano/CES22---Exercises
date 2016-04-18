//Implementa��o da classe produtor
public class Produtor extends Thread {
	//Atributos do Produtor
	private int idProdutor;
	private Buffer pilha;
	private int producaoTotal;
	
	//Construtor padr�o
	public Produtor (int id, Buffer p, int producaoTotal){
		idProdutor = id;
		pilha = p;
		this.producaoTotal = producaoTotal;
	}
	//Na execu��o, este tenta produzir elementos para inserir no buffer compartilhado
	public void run(){
		for (int i = 0; i < producaoTotal; i++){
			pilha.set(idProdutor, i);
		}
		System.out.println("Produtor #" + idProdutor + " concluido!");
	}

}
