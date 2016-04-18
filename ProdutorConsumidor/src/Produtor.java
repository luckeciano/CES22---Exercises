//Implementação da classe produtor
public class Produtor extends Thread {
	//Atributos do Produtor
	private int idProdutor;
	private Buffer pilha;
	private int producaoTotal;
	
	//Construtor padrão
	public Produtor (int id, Buffer p, int producaoTotal){
		idProdutor = id;
		pilha = p;
		this.producaoTotal = producaoTotal;
	}
	//Na execução, este tenta produzir elementos para inserir no buffer compartilhado
	public void run(){
		for (int i = 0; i < producaoTotal; i++){
			pilha.set(idProdutor, i);
		}
		System.out.println("Produtor #" + idProdutor + " concluido!");
	}

}
