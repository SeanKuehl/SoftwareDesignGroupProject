package Devices;

import java.io.IOException;

import vv.CarScreen;

public class DVDTray {
	
	public void CloseDVDTray() {
		try {
			CarScreen.ChangeDVD("DVDClosed.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void OpenDVDTray() {
		try {
			CarScreen.ChangeDVD("DVDOpen.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
