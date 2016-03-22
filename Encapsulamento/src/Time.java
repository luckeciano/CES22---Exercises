//Class Time
public class Time {
	//encapsulamento dos atributos: tornam-se private
	private int hour;
	private int minute;
	
	//implementa-se um construtor com o horário
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
	//Note que existe condições para os modificadores, o que não aconteceria
	//se os objetos não estivessem encapsulados.
	
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

//Existe uma série de vantagens de utilizar o encapsulamento
//Facilidade de manutenção: podemos modificar a classe Time e seus atributos e os possíveis
// usuários desta classe continuarão podendo utilizá-la independente desta alteração

// Uso do objeto: o objeto t da classe Time é disponibilizado ao usuário com toda a sua funcionalidade
// sem este precisar conhecer o funcionamento interno da classe

// Implementações futuras com a classe Time são aceleradas, uma vez que os usuários
// Não precisam, necessariamente, saber como os objetos são constituídos internamente.

// Por fim, uma grande vantagem do encapsulamento é que você pode garantir a validade
// das informações em setters. Na classe Time, os setters garantem que o horário armazenado
// no objeto seja válido, algo que não aconteceria se os atributos fossem públicos.


