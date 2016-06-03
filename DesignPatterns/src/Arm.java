
public class Arm extends BodyParts {
	public double radius;
	
	public double length;
	
	public Arm(String RobotType) {
		if (RobotType == "NAO"){
			NaoImpl naoImpl = new NaoImpl();
			naoImpl.createArm(this);
		}
		
		else if (RobotType == "BIOLOID") {
			BioloidImpl bioImpl = new BioloidImpl();
			bioImpl.createArm(this);
		}
		
	}

}
