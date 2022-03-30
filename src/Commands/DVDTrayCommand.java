package Commands;

import Devices.DVDTray;
import vv.Command;

public class DVDTrayCommand implements Command{

	private int state = 0;	//this represents a closed dvd tray
	private DVDTray dvd;
	
	public DVDTrayCommand() {
		dvd = new DVDTray();
	}
	
	@Override
	public void execute() {
		if (state == 0) {
			dvd.OpenDVDTray();
			state = 1;
		}
		else if (state == 1) {
			dvd.CloseDVDTray();
			state = 0;
		}
		
	}

	@Override
	public void Initialize() {
		dvd.CloseDVDTray();
		
	}

	@Override
	public String GetName() {
		return "DVD";
	}

}
