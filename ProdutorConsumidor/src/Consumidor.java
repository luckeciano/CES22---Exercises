//Implementação da classe consumidor
public class Consumidor extends Thread {
	
	//Atributos do consumidor
	private int idConsumidor;
	private Buffer pilha;
	private int totalConsumir;
	
	//Construtor padrão
	public Consumidor (int id, Buffer p, int totalConsumir){
		idConsumidor = id;
		pilha = p;
		this.totalConsumir = totalConsumir;
	}
	
	//Na execução, este tentar consumir os itens do buffer comaprtilhado
	public void run(){
		for (int i = 0; i < totalConsumir; i++){
			pilha.get(idConsumidor);
		}
		System.out.println("Consumidor #" + idConsumidor + " concluído!");
	}
}
