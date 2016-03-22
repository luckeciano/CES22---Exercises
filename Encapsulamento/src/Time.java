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
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	public void setMinute (int minute)
	{
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
