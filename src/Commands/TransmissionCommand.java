package Commands;

import Devices.Transmission;
import vv.Command;

public class TransmissionCommand implements Command{

	
	private int state = 0;	//this is the default 'park'
	private Transmission transmission;
	
	public TransmissionCommand() {
		transmission = new Transmission();
	}
	
	@Override
	public void execute() {
		if (state == 0) {
			transmission.TransmissionReverse();
			state = -1;
		}
		else if (state == -1) {
			transmission.TransmissionDrive();
			state = 1;
		}
		else if (state == 1) {
			transmission.TransmissionPark();
			state = 0;
		}
		
	}

	@Override
	public void Initialize() {
		transmission.TransmissionPark();
		
	}

	@Override
	public String GetName() {
		return "Transmission";
	}

}
