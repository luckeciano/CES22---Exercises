//O polimorfismo é um princípio de programação orientada a objetos que permite que
//classes derivadas de uma única classe base são capazes de invocar métodos que
//embora apresentem mesma "assinatura", comportam-se de maneira diferente.

//Observe a implementação da classe abstrata MathOperations, que 
//representa qualquer operação matemática
public abstract class MathOperations {
	public abstract double calcular (double x, double y);

}
// Vamos implementar soma, subtração e multiplicação


