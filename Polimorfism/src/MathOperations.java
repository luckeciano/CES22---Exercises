//O polimorfismo � um princ�pio de programa��o orientada a objetos que permite que
//classes derivadas de uma �nica classe base s�o capazes de invocar m�todos que
//embora apresentem mesma "assinatura", comportam-se de maneira diferente.

//Observe a implementa��o da classe abstrata MathOperations, que 
//representa qualquer opera��o matem�tica
public abstract class MathOperations {
	public abstract double calculate (double x, double y);

}
// Vamos implementar soma e subtra��o em outros arquivos e a classe Results,
// onde estar� a main do projeto. Acompanhe o resto da explica��o por l�!


