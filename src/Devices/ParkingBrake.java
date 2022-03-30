package Devices;

import java.io.IOException;

import vv.CarScreen;

public class ParkingBrake {
	
	
	public void ParkingBrakeOn() {
		try {
			CarScreen.ChangeParkingBrake("ParkingBrakeOn.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ParkingBrakeOff() {
		try {
			CarScreen.ChangeParkingBrake("ParkingBrakeOff.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
