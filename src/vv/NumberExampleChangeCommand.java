package vv;

public class NumberExampleChangeCommand implements Command{

	int state = 1;
	NumberExample numberExample;
	
	public NumberExampleChangeCommand() {
		numberExample = new NumberExample();
	}
	
	@Override
	public void execute() {
		if (state == 1) {
			numberExample.ShowOne();
			state += 1;
		}
		else if (state == 2) {
			numberExample.ShowTwo();
			state += 1;
		}
		else if (state == 3) {
			numberExample.ShowThree();
			state = 1;
		}
		
	}

}
