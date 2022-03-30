package Devices;

import java.io.IOException;

import vv.CarScreen;

public class CarDoor {
	
	public void OpenDoor() {
		try {
			CarScreen.ChangeCarDoor("CarDoorOpen.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void CloseDoor() {
		try {
			CarScreen.ChangeCarDoor("CarDoorClosed.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
