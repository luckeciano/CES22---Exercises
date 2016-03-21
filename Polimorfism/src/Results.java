public class Results {
	public static void showCalc (MathOperations mathOps, double x, double y)
	{
		System.out.println("Results: " + mathOps.calculate(x, y));
	}
	
	public static void main (String args[])
	{
		//Cálculo da soma
		Results.showCalc(new Sum(), 5, 5); //"Results: 10"
		
		//Cálculo da subtração
		Results.showCalc(new Subtract(), 5, 5); //"Results: 0"
	}

}
//O método de cálculo foi chamado duas vezes na main. Porém, em cada vez apresentou
//comportamento diferente, pois fazia referência a uma classe diferente.
//Uma outra forma de polimorfismo seria o method overloading, quando uma mesma classe
//possui dois ou mais métodos com a mesma assinatura, com a diferença sendo os argumentos
//passados para o método.


