
public class BioloidRobot extends Robot {
	public BioloidRobot(String name, Mediator m) {
		this.arm = new Arm("BIOLOID");
		this.leg = new Leg("BIOLOID");
		this.trunk = new Trunk ("BIOLOID");
		this.head = new Head("BIOLOID");
		this.type = "BIOLOID";
		this.mediator = m;
		this.name = name;
	}

}
