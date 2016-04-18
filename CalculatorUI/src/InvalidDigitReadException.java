import java.io.IOException;
// Criação de um novo tipo de exceção que herda de IOException
public class InvalidDigitReadException extends IOException {
	InvalidDigitReadException (String message){
		super(message);
	}

}
