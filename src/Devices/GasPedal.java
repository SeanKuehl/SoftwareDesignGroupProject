package Devices;

import java.io.IOException;

import vv.CarScreen;

public class GasPedal {
	
	public void GasPedalUp() {
		try {
			CarScreen.ChangeGasPedal("GasPedalUp.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void GasPedalDown() {
		try {
			CarScreen.ChangeGasPedal("GasPedalDown.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
