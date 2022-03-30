package Devices;

import java.io.IOException;

import vv.CarScreen;

public class BrakePedal {
	
	public void BrakePedalUp() {
		try {
			CarScreen.ChangeBrakePedal("BrakePedalUp.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void BrakePedalDown() {
		try {
			CarScreen.ChangeBrakePedal("BrakePedalDown.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
