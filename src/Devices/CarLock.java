package Devices;

import java.io.IOException;

import vv.CarScreen;

public class CarLock {
	
	public void LockCar() {
		try {
			CarScreen.ChangeCarLock("CarLocked.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void UnlockCar() {
		try {
			CarScreen.ChangeCarLock("CarUnlocked.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
