public class Results {
	public static void showCalc (MathOperations mathOps, double x, double y)
	{
		System.out.println("Results: " + mathOps.calculate(x, y));
	}
	
	public static void main (String args[])
	{
		//C�lculo da soma
		Results.showCalc(new Sum(), 5, 5); //"Results: 10"
		
		//C�lculo da subtra��o
		Results.showCalc(new Subtract(), 5, 5); //"Results: 0"
	}

}
//O m�todo de c�lculo foi chamado duas vezes na main. Por�m, em cada vez apresentou
//comportamento diferente, pois fazia refer�ncia a uma classe diferente.
//Uma outra forma de polimorfismo seria o method overloading, quando uma mesma classe
//possui dois ou mais m�todos com a mesma assinatura, com a diferen�a sendo os argumentos
//passados para o m�todo.


