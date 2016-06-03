
public class Trunk extends BodyParts {
	
	public double xLength;
	
	public double yLength;
	
	public double zLength;
	
	public Trunk(String RobotType) {
		if (RobotType == "NAO"){
			NaoImpl naoImpl = new NaoImpl();
			naoImpl.createTrunk(this);
		}
		
		else if (RobotType == "BIOLOID") {
			BioloidImpl bioImpl = new BioloidImpl();
			bioImpl.createTrunk(this);
		}
	}

}
