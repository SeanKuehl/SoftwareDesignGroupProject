package Commands;

import Devices.GasPedal;
import vv.Command;

public class GasPedalCommand implements Command{
	
	private int state = 0;	//default state is gas pedal up
	private GasPedal pedal;
	
	public GasPedalCommand()
	{
		pedal = new GasPedal();
	}
	@Override
	public void execute() {
		if (state == 0) {
			pedal.GasPedalDown();
			state = 1;
		}
		else if (state == 1) {
			pedal.GasPedalUp();
			state = 0;
		}
		
	}

	@Override
	public void Initialize() {
		pedal.GasPedalUp();
		
	}

	@Override
	public String GetName() {
		return "Gas Pedal";
	}

}
