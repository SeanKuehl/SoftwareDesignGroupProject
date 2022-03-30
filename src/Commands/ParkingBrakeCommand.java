package Commands;

import Devices.ParkingBrake;
import vv.Command;

public class ParkingBrakeCommand implements Command{
	
	private int state = 0;	//default is parking brake off
	private ParkingBrake brake;
	
	public ParkingBrakeCommand() {
		brake = new ParkingBrake();
	}

	@Override
	public void execute() {
		if (state == 0) {
			brake.ParkingBrakeOn();
			state = 1;
		}
		else if (state == 1) {
			brake.ParkingBrakeOff();
			state = 0;
		}
		
	}

	@Override
	public void Initialize() {
		brake.ParkingBrakeOff();
		
	}

	@Override
	public String GetName() {
		return "Parking Brake";
	}

}
