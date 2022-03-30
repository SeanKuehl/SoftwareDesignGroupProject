package Devices;

import java.io.IOException;

import vv.CarScreen;

public class SteeringWheel {
	
	
	
	public void SteeringWheelLeft() {
		try {
			CarScreen.ChangeSteeringWheel("SteeringWheelLeft.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void SteeringWheelRight() {
		try {
			CarScreen.ChangeSteeringWheel("SteeringWheelRight.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void SteeringWheelMiddle() {
		try {
			CarScreen.ChangeSteeringWheel("SteeringWheelMiddle.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
