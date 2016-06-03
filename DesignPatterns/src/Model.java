
public class Model {
	public static void main (String[] args) {
		CommunicationMediator mediator = new CommunicationMediator();
		RobotFactory robFactory = new RobotFactory();
		Robot naoRobot = robFactory.createRobot("NAO", "NAO 1", mediator);
		Robot bioloidRobot = robFactory.createRobot("BIOLOID", "BIO 1", mediator);
		Robot bioloidRobot2 = robFactory.createRobot("BIOLOID", "BIO 2", mediator);
		Robot naoRobot2 = robFactory.createRobot("NAO", "NAO 2", mediator);
		

		mediator.addAgent(naoRobot);
		mediator.addAgent(bioloidRobot);
		mediator.addAgent(naoRobot2);
		mediator.addAgent(bioloidRobot2);
		
		naoRobot.sendMessage("Eu sou um robo NAO");
		bioloidRobot.sendMessage("Eu sou um robo BIOLOID");
	}

}