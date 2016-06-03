
public class RobotFactory {

	public Robot createRobot(String RobotType,String name, Mediator m) {
		if (RobotType == "NAO") {
			NaoRobot naoRobot = new NaoRobot(name, m);
			return naoRobot;
		}
		else if (RobotType == "BIOLOID") {
			BioloidRobot bioloidRobot = new BioloidRobot(name, m);
			return bioloidRobot;
		}
		else
			return null;
	}
}
