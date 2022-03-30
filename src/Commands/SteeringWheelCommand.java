package Commands;

import Devices.SteeringWheel;
import vv.Command;

public class SteeringWheelCommand implements Command{

	
	private int state = 0;	//this is the default state of 'middle'
	SteeringWheel steeringWheel;
	
	public SteeringWheelCommand() {
		steeringWheel = new SteeringWheel();
	}
	
	@Override
	public void execute() {
		if (state == 0) {
			steeringWheel.SteeringWheelLeft();
			state = -1;
		}
		else if (state == -1) {
			steeringWheel.SteeringWheelRight();
			state = 1;
		}
		else if (state == 1) {
			steeringWheel.SteeringWheelMiddle();
			state = 0;
		}
		
		
	}

	@Override
	public void Initialize() {
		steeringWheel.SteeringWheelMiddle();
		
	}

	@Override
	public String GetName() {
		return "Steering";
	}

}
