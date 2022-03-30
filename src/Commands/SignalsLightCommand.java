package Commands;

import Devices.SignalLight;
import vv.Command;

public class SignalsLightCommand implements Command{

	private int state = 0;	//this is the default neutral state
	private SignalLight signal;
	
	public SignalsLightCommand() {
		signal = new SignalLight();
	}
	
	
	@Override
	public void execute() {
		if (state == 0) {
			signal.SignalLeft();
			state = -1;
		}
		else if (state == -1) {
			signal.SignalRight();
			state = 1;
		}
		else if (state == 1) {
			signal.NoSignal();
			state = 0;
		}
		
	}

	@Override
	public void Initialize() {
		signal.NoSignal();
		
	}


	@Override
	public String GetName() {
		return "Signal Lights";
	}

}
