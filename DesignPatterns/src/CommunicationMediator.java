import java.util.ArrayList;

public class CommunicationMediator implements Mediator {
	
	protected ArrayList<Robot> agents;
	
	public CommunicationMediator () {
		agents = new ArrayList<Robot>();
	}
	
	public void addAgent(Robot robot) {
		agents.add(robot);
	}
	
	@Override
	public void communicate(String message, Robot robot) {
		if (robot instanceof NaoRobot){
			for (Robot agent: agents) {
				if (robot != agent)
					System.out.println(robot.name + " MESSAGE TO " + agent.name + " : " + message);
			}
		}	
		else if (robot instanceof BioloidRobot) {
			for (Robot agent: agents) {
				if (robot != agent)
					System.out.println(robot.name + " MESSAGE TO " + agent.name + " : " + message);
			}
		}
		
			
		
	}

}
