
public class Head extends BodyParts {
	public double radius;
		
	public Head(String RobotType) {
		if (RobotType == "NAO"){
			NaoImpl naoImpl = new NaoImpl();
			naoImpl.createHead(this);
		}
		
		else if (RobotType == "BIOLOID") {
			BioloidImpl bioImpl = new BioloidImpl();
			bioImpl.createHead(this);
		}
	}

}
