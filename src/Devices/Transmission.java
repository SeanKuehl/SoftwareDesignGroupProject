package Devices;

import java.io.IOException;

import vv.CarScreen;

public class Transmission {
	
	public void TransmissionPark() {
		try {
			CarScreen.ChangeTransmission("TransmissionPark.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TransmissionReverse() {
		try {
			CarScreen.ChangeTransmission("TransmissionReverse.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void TransmissionDrive() {
		try {
			CarScreen.ChangeTransmission("TransmissionDrive.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
