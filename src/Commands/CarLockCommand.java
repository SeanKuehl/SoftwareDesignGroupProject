package Commands;

import Devices.CarLock;
import vv.Command;

public class CarLockCommand implements Command{
	
	private int state = 0;	//default state is unlocked
	private CarLock lock;
	
	public CarLockCommand() {
		lock = new CarLock();
	}

	@Override
	public void execute() {
		if (state == 0) {
			lock.LockCar();
			state = 1;
		}
		else if (state == 1) {
			lock.UnlockCar();
			state = 0;
		}
		
	}

	@Override
	public void Initialize() {
		lock.UnlockCar();
		
	}

	@Override
	public String GetName() {
		return "Car Lock";
	}

}
