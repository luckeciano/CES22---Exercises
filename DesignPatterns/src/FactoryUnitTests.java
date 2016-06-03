import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryUnitTests {

	@Test
	public void testFactory() {
		RobotFactory robotFactory = new RobotFactory();
		CommunicationMediator mediator = new CommunicationMediator();
		Robot naoRobot = robotFactory.createRobot("NAO", "NAO TEST", mediator);
		Robot bioloidRobot = robotFactory.createRobot("BIOLOID", "BIO TEST", mediator);
		assertEquals (naoRobot.type, "NAO");
		assertEquals (bioloidRobot.type, "BIOLOID");
		assertEquals (naoRobot.name, "NAO TEST");
		assertEquals (bioloidRobot.name, "BIO TEST");
	}

}
