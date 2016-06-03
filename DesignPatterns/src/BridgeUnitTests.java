import static org.junit.Assert.*;

import org.junit.Test;

public class BridgeUnitTests {

	@Test
	public void testArmNao() {
		Arm arm = new Arm("NAO");
		assertEquals (arm.radius, 0.05, 0.005);
		assertEquals (arm.length, 0.30, 0.01 );
		assertEquals (arm.bodyType, "ARM");
	}
	@Test
	public void testLegNao() {
		Leg leg = new Leg("NAO");
		assertEquals (leg.radius, 0.07, 0.005);
		assertEquals (leg.length, 0.40, 0.01 );
		assertEquals (leg.bodyType, "LEG");
	}
	@Test
	public void testHeadNao() {
		Head head = new Head("NAO");
		assertEquals (head.radius, 0.12, 0.005);
		assertEquals (head.bodyType, "HEAD");
	}
	@Test
	public void testTrunkNao() {
		Trunk trunk = new Trunk("NAO");
		assertEquals (trunk.xLength, 0.2, 0.05);
		assertEquals (trunk.yLength, 0.4, 0.05 );
		assertEquals (trunk.zLength, 0.17, 0.01 );
		assertEquals (trunk.bodyType, "TRUNK");
	}
	
	
	@Test
	public void testArmBioloid() {
		Arm arm = new Arm("BIOLOID");
		assertEquals (arm.radius, 0.06, 0.005);
		assertEquals (arm.length, 0.28, 0.01 );
		assertEquals (arm.bodyType, "ARM");
	}
	@Test
	public void testLegBioloid() {
		Leg leg = new Leg("BIOLOID");
		assertEquals (leg.radius, 0.08, 0.005);
		assertEquals (leg.length, 0.37, 0.01 );
		assertEquals (leg.bodyType, "LEG");
	}
	@Test
	public void testHeadBioloid() {
		Head head = new Head("BIOLOID");
		assertEquals (head.radius, 0.14, 0.005);
		assertEquals (head.bodyType, "HEAD");
	}
	@Test
	public void testTrunkBioloid() {
		Trunk trunk = new Trunk("BIOLOID");
		assertEquals (trunk.xLength, 0.22, 0.05);
		assertEquals (trunk.yLength, 0.37, 0.05 );
		assertEquals (trunk.zLength, 0.19, 0.01 );
		assertEquals (trunk.bodyType, "TRUNK");
	}
	

}
