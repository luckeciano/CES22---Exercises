import java.io.IOException;
// Cria��o de um novo tipo de exce��o que herda de IOException
public class InvalidDigitReadException extends IOException {
	InvalidDigitReadException (String message){
		super(message);
	}

}
