package Devices;

import java.io.IOException;

import vv.CarScreen;

public class SignalLight {
	
	public void SignalLeft() {
		try {
			CarScreen.ChangeSignal("SignalsLeft.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void SignalRight() {
		try {
			CarScreen.ChangeSignal("SignalsRight.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void NoSignal()
	{
		try {
			CarScreen.ChangeSignal("SignalsNeutral.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
