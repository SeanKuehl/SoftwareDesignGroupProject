package Commands;

import Devices.CarDoor;
import vv.Command;

public class CarDoorCommand implements Command{
	
	private int state = 0;	//default state is closed
	private CarDoor door;
	
	public CarDoorCommand() {
		door = new CarDoor();
	}

	@Override
	public void execute() {
		if (state == 0) {
			door.OpenDoor();
			state = 1;
		}
		else if (state == 1) {
			door.CloseDoor();
			state = 0;
		}
		
	}

	@Override
	public void Initialize() {
		door.CloseDoor();
		
	}

	@Override
	public String GetName() {
		return "Car Door";
	}

}
