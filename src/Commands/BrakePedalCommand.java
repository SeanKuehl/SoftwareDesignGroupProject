package Commands;

import Devices.BrakePedal;
import vv.Command;

public class BrakePedalCommand implements Command{
	
	private int state = 0;	//default state is gas pedal up
	private BrakePedal pedal;
	
	public BrakePedalCommand() {
		pedal = new BrakePedal();
	}

	@Override
	public void execute() {
		if (state == 0) {
			pedal.BrakePedalDown();
			state = 1;
		}
		else if (state == 1) {
			pedal.BrakePedalUp();
			state = 0;
		}
		
	}

	@Override
	public void Initialize() {
		pedal.BrakePedalUp();
		
	}

	@Override
	public String GetName() {
		return "Brake Pedal";
	}

}
