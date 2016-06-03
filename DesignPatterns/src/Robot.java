
public abstract class Robot {
	public Arm arm;
	public Leg leg;
	public Head head;
	public Trunk trunk;
	public String type;
	public Mediator mediator;
	public String name;

	public void sendMessage(String message) {
		mediator.communicate(message, this);
	}
}
	