
public class NaoImpl implements BodyPartsImpl {
	
	@Override
	public void createArm (Arm arm) {
		arm.bodyType = "ARM";
		arm.robotType = "NAO";
		arm.radius = 0.05;
		arm.length = 0.30;		
	}
	
	@Override
	public void createHead (Head head) {
		head.bodyType = "HEAD";
		head.robotType = "NAO";
		head.radius = 0.12;
		
	}
	
	@Override
	public void createLeg (Leg leg) {
		leg.bodyType = "LEG";
		leg.robotType = "NAO";
		leg.radius = 0.07;
		leg.length = 0.40;	
		
	}
	
	@Override
	public void createTrunk (Trunk trunk) {
		trunk.bodyType = "TRUNK";
		trunk.robotType = "NAO";
		trunk.xLength = 0.2;
		trunk.yLength = 0.4;
		trunk.zLength = 0.17;	
		
	}

}
