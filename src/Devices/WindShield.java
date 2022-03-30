package Devices;

import java.io.IOException;

import vv.CarScreen;

public class WindShield {
	
	public void NoWipers() {
		try {
			CarScreen.ChangeWipers("WindShieldNoWipers.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Wipers() {
		try {
			CarScreen.ChangeWipers("WindShieldWipers.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void FastWipers() {
		try {
			CarScreen.ChangeWipers("WindShieldWipersFast.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void FasterWipers() {
		try {
			CarScreen.ChangeWipers("WindShieldWipersFaster.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void FastestWipers() {
		try {
			CarScreen.ChangeWipers("WindShieldWipersFastest.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
