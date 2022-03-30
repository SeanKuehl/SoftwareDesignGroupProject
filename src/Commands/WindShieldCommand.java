package Commands;

import Devices.WindShield;
import vv.Command;

public class WindShieldCommand implements Command{
	
	private int state = 0;	//this is for no wipers
	private WindShield wipers;
	
	public WindShieldCommand() {
		wipers = new WindShield();
	}

	@Override
	public void execute() {
		if (state == 0) {
			wipers.Wipers();
			state = 1;
		}
		else if (state == 1) {
			wipers.FastWipers();
			state = 2;
		}
		else if (state == 2) {
			wipers.FasterWipers();
			state = 3;
		}
		else if (state == 3) {
			wipers.FastestWipers();
			state = 4;
		}
		else if (state == 4) {
			wipers.NoWipers();
			state = 0;
		}
		
	}

	@Override
	public void Initialize() {
		wipers.NoWipers();
		
	}

	@Override
	public String GetName() {
		return "WindShield";
	}

}
