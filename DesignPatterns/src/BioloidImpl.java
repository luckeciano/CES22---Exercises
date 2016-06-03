
public class BioloidImpl implements BodyPartsImpl {
	
	@Override
	public void createArm (Arm arm) {
		arm.bodyType = "ARM";
		arm.robotType = "BIOLOID";
		arm.radius = 0.06;
		arm.length = 0.28;
		
	}
	
	@Override
	public void createHead (Head head) {
		head.bodyType = "HEAD";
		head.robotType = "BIOLOID";
		head.radius = 0.14;
		
	}
	
	@Override
	public void createLeg (Leg leg) {
		leg.bodyType = "LEG";
		leg.robotType = "NAO";
		leg.radius = 0.08;
		leg.length = 0.37;		
		
	}
	
	@Override
	public void createTrunk (Trunk trunk) {
		trunk.bodyType = "TRUNK";
		trunk.robotType = "NAO";
		trunk.xLength = 0.22;
		trunk.yLength = 0.37;
		trunk.zLength = 0.19;
		
	}

}
