//Classe do buffer compartilhado pelo produtor e consumidor
public class Buffer {
	//Atributos do buffer
	private int conteudo;
	private boolean disponivel;
	//Método set: utilizado pelo produtor para inserir itens no buffer
	//Isto ocorre quando não há itens no buffer. Caso haja, este espera, i.e,
	//a thread adormece
	public synchronized void set(int idProdutor, int valor){
		while (disponivel == true){
			try {
				System.out.println("Produtor #" + idProdutor + " esperando...");
				wait();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		conteudo = valor;
		System.out.println("Produtor #" + idProdutor + " : colocou " + conteudo);
		disponivel = true;
		notifyAll();
	}
	
	//Método get: utilizado pelo consumidor para obter itens do buffer
	//Isto ocorre quando há itens no buffer. Caso não haja, este espera, i.e,
	//a thread adormece	
	public synchronized int get(int idConsumidor){
		while (disponivel == false){
			try {
				System.out.println("Consumidor #" + idConsumidor + " esperando...");
				wait();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Consumidor #" + idConsumidor + " consumiu: " + conteudo);
		disponivel = false;
		notifyAll();
		return conteudo;
	}
	//Main: exemplo com dois produtores e dois consumidores
	//A saída do console pode variar, pois as threads são chamadas aleatoriamente
	//Para maiores detalhes, visite o wiki do projeto.
	public static void main (String args[]){
		Buffer bufferCompartilhado = new Buffer();
		Produtor produtor1 = new Produtor (1, bufferCompartilhado, 5);
		Produtor produtor2 = new Produtor (2, bufferCompartilhado, 5);
		Consumidor consumidor1 = new Consumidor (1, bufferCompartilhado, 2);
		Consumidor consumidor2 = new Consumidor (2, bufferCompartilhado, 8);
		
		produtor1.start();
		consumidor1.start();
		produtor2.start();
		consumidor2.start();
	}

}
