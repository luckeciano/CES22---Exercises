
public class NaoRobot extends Robot {
	public NaoRobot(String name, Mediator m) {
		this.arm = new Arm("NAO");
		this.leg = new Leg("NAO");
		this.trunk = new Trunk ("NAO");
		this.head = new Head("NAO");
		this.type = "NAO";
		this.mediator = m;
		this.name = name;
	}

}
