//Class CalculatorInput

import java.io.*;

public class CalculatorInput {
	
	BufferedReader stream;
	CalculatorEngine engine;
	
	public static String m;
	
	CalculatorInput(CalculatorEngine e){
		InputStreamReader input = new InputStreamReader (System.in);
		stream = new BufferedReader (input);
		engine = e;
	}
	
	void run() throws IOException {
		for (;;){
			
			System.out.print ("[" + engine.display() + "]");
			//InvalidDigitReadException: Leitura Inv�lida
			try {
				m = stream.readLine();
				if (m == null) break;
				if (m.length() > 0){
					char c = m.charAt (0);
					if (c == '+') engine.add();
					else if (c == '-') engine.subtract();
					else if (c == '*') engine.multiply();
					else if (c == '/'){
						try {
							engine.divide();
						} catch (ArithmeticException e){
							System.out.println(e.getMessage());
						}
						
					}
					else if (c >= '0' && c <= '9') engine.digit (c - '0');
					else if (c == '=') engine.compute();
					else if (c == 'c' || c == 'C') engine.clear();	
				}
			} catch (InvalidDigitReadException e){
				System.out.println("Erro na leitura");
			}
			
		}
	}
	public static void main (String arg[]) throws Exception {
		CalculatorEngine e = new CalculatorEngine();
		CalculatorInput x = new CalculatorInput(e);
		x.run();
	}

}
