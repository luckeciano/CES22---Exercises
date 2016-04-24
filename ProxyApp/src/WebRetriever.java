import java.io.*;
import java.net.*;

public class WebRetriever {
	
	//Atributos da classe WebRetriever
	Socket soc;
	OutputStream os;
	InputStream is;
	String webServer;
	//Construtor Padr�o
	WebRetriever (String server, int port) throws IOException, UnknownHostException{
		webServer = server;
		soc = new Socket(server, port);
		os = soc.getOutputStream();
		is = soc.getInputStream();		
	}
	
	//Requisi��o do usu�rio
	void request (String path){
		try {
			System.out.println("GET Request: " + path);
			String message = "GET " + path + "\n\n";
			os.write(message.getBytes());
			os.flush();
		} catch (IOException e){
			System.err.println("Error in HTTP Request");
		}
	}
	//Resposta do servidor web
	void getResponse (){
		int c;
		System.out.println("Retornando resposta do servidor...");
		try {
			while ((c = is.read()) != -1){
				System.out.print((char) c);
			}
		}catch (IOException e){
			System.err.println("IOException in reading from Web server");
		}
	}
	//Fechando recursos
	public void close(){
		try {
			is.close();
			os.close();
			soc.close();
		}catch (IOException e){
			System.err.println("IOException in closing connection");
		}
	}
	

	//main
	public static void main (String args[]){
		//Leitura do URL enviado pelo cliente
		System.out.println("Por favor, especifique a URL que voc� deseja acessar:");
		String content = null;
		String message = null;
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		while (true){	
			try {			
				while ((message = input.readLine())!= null){
					if (message.equals("")){
						break;
					}
					content = message;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			String[] url = content.split("/",2);
			//Estabelecimento de conex�o com o servidor
			try {
				int port = 80;
				//Proxy bloqueia entrada no facebook
				if (url[0].equals("www.facebook.com")){
					System.out.println("O acesso a este site est� proibido");
				}
				else {
					System.out.println("Server: " + url[0]);
					WebRetriever w = new WebRetriever (url[0], port);
					System.out.println("Voc� est� conectado a " + url[0]
							+ " pela porta " + port);			
					if (url.length == 2)
						w.request("/" + url[1] + "/");
					else w.request("/");
					w.getResponse();
					w.close();	
				}
			}catch (UnknownHostException h){
				System.err.println("Hostname Unknown");
			}catch (IOException i){
				System.err.println("IOException in connecting to Host");
				i.printStackTrace();
			}
		}
	}
}
