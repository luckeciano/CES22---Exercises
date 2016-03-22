//Class Time
public class Time {
	//encapsulamento dos atributos: tornam-se private
	private int hour;
	private int minute;
	
	//implementa-se um construtor com o hor�rio
	public Time(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}	
	//Para acessar os atributos privados, utilizamos um getter
	public int getHour()
	{
		return this.hour;
	}
	public int getMinute()
	{
		return this.minute;
	}
	//Para modificar os atributos indiretamente, utilizamos setters
	//Note que existe condi��es para os modificadores, o que n�o aconteceria
	//se os objetos n�o estivessem encapsulados.
	
	public void setHour(int hour)
	{
		if (hour >= 0 || hour <= 23)
			this.hour = hour;
		
	}
	public void setMinute (int minute)
	{
		if (minute >=0 || minute <= 59)
			this.minute = minute;
	}
	// Funcionamento de getters e setters:
	public static void main (String args[])
	{
		Time t = new Time(16, 30);
		System.out.println("The time now is: " + t.getHour() + ":" + t.getMinute());
		t.setHour(17);
		t.setMinute(30);
		System.out.println("Time has passed. Now is: " + t.getHour() + ":" + t.getMinute());
	}

}

//Existe uma s�rie de vantagens de utilizar o encapsulamento
//Facilidade de manuten��o: podemos modificar a classe Time e seus atributos e os poss�veis
// usu�rios desta classe continuar�o podendo utiliz�-la independente desta altera��o

// Uso do objeto: o objeto t da classe Time � disponibilizado ao usu�rio com toda a sua funcionalidade
// sem este precisar conhecer o funcionamento interno da classe

// Implementa��es futuras com a classe Time s�o aceleradas, uma vez que os usu�rios
// N�o precisam, necessariamente, saber como os objetos s�o constitu�dos internamente.

// Por fim, uma grande vantagem do encapsulamento � que voc� pode garantir a validade
// das informa��es em setters. Na classe Time, os setters garantem que o hor�rio armazenado
// no objeto seja v�lido, algo que n�o aconteceria se os atributos fossem p�blicos.


