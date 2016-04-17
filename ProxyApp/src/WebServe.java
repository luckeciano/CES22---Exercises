import java.io.*;
import java.net.*;
import java.util.StringTokenizer;

public class WebServe implements Runnable {
	Socket soc;
	OutputStream os;
	BufferedReader is;
	String resource;
	
	public void SafePrintln(String s){
		synchronized (System.out){
			System.out.println(s);
		}
	}
	
	public void run(){
		SafePrintln("Running new proxy thread");
		getRequest();
		returnResponse();
		close();
	}
	
	public static void main(String args[]){
		try {
			ServerSocket s = new ServerSocket (8000);
			for (;;){
				WebServe w  = new WebServe (s.accept());
				Thread thr = new Thread (w);
				thr.start();
			}
		}catch (IOException i){
			System.err.println("IOException in Server");
		}
	}
	
	WebServe (Socket s) throws IOException {
		soc = s;
		os = soc.getOutputStream();
		is = new BufferedReader (new InputStreamReader(soc.getInputStream()));		
	}
	
	void getRequest(){
		SafePrintln("Getting Request");
		try {
			String message;			
			while ((message = is.readLine())!= null){
				if (message.equals("")){
					break;				
				}
				System.err.println(message);
				StringTokenizer t = new StringTokenizer (message);
				String token = t.nextToken();
				if (token.equals("GET")){
					resource = t.nextToken();
				}				
			}
		}catch (IOException e){
			System.err.println("Error receiving Web request");
		}
	}
	
	void returnResponse(){
		int c;
		try {
			FileInputStream f = new FileInputStream ("." + resource);
			while ((c  = f.read())!= -1){
				os.write(c);
			}
			f.close();
		}catch (IOException e){
			System.err.println("IOException is reading in web");
		}
	}
		
	public void close(){
		try {
			is.close(); os.close(); soc.close();
		} catch (IOException e){
			System.err.println("IOException in closing connection");
		}
	}

}
