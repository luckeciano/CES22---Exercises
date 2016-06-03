import static org.junit.Assert.*;

import org.junit.Test;

public class MediatorUnitTests {

	@Test
	public void testCommunicationMediator() {
		RobotFactory robotFactory = new RobotFactory();
		CommunicationMediator mediator = new CommunicationMediator();
		Robot naoRobot = robotFactory.createRobot("NAO", "NAO TEST", mediator);
		Robot bioloidRobot = robotFactory.createRobot("BIOLOID", "BIO TEST", mediator);
		
		mediator.addAgent(naoRobot);
		mediator.addAgent(bioloidRobot);
		assertEquals (mediator.agents.size(), 2);
	}

}
