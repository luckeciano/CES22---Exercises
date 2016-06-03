
public class Leg extends BodyParts {
	
	public double radius;
	
	public double length;
	
	public double kneePos;
	
	public Leg(String RobotType) {
		if (RobotType == "NAO"){
			NaoImpl naoImpl = new NaoImpl();
			naoImpl.createLeg(this);
		}
		
		else if (RobotType == "BIOLOID") {
			BioloidImpl bioImpl = new BioloidImpl();
			bioImpl.createLeg(this);
		}
	}

}
