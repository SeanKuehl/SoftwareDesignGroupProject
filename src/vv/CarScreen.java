package vv;

import javax.swing.JPanel;

import Commands.BrakePedalCommand;
import Commands.CarDoorCommand;
import Commands.CarLockCommand;
import Commands.DVDTrayCommand;
import Commands.GasPedalCommand;
import Commands.ParkingBrakeCommand;
import Commands.SignalsLightCommand;
import Commands.SteeringWheelCommand;
import Commands.TransmissionCommand;
import Commands.WindShieldCommand;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CarScreen extends JPanel {

	
	private Command currentCommand;

	
	private static JLabel steeringWheel;
	private static JLabel transmission;
	private static JLabel signal;
	private static JLabel DVD;
	private static JLabel windShield;
	private static JLabel gasPedal;
	private static JLabel brakePedal;
	private static JLabel parkingBrake;
	private static JLabel carLock;
	private static JLabel carDoor;
	
	private SteeringWheelCommand steering;
	private TransmissionCommand transmissionShift;
	private SignalsLightCommand signalLights;
	private DVDTrayCommand dvdCommand;
	private WindShieldCommand wipers;
	private GasPedalCommand pedal;
	private BrakePedalCommand brake;
	private ParkingBrakeCommand parking;
	private CarLockCommand lock;
	private CarDoorCommand door;
	
	
	private ArrayList<Command> commandList = new ArrayList<Command>();
	private int commandInt = 0;


	/**
	 * Create the panel.
	 */
	
	
	
	public CarScreen() {
		setBackground(Color.BLACK);
		
		InitializeResources();
		
		currentCommand = steering;	//steering will be the default first command
		
		
		setLayout(null);
		
		JButton btnNewButton = new JButton(steering.GetName());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentCommand.execute();
			}
		});
		btnNewButton.setBounds(134, 501, 158, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(commandList.get(1).GetName());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				commandInt += 1;
				
				if (commandInt > commandList.size()-1) {
					commandInt = 0;
				}
				
				currentCommand = commandList.get(commandInt);
				btnNewButton.setText(currentCommand.GetName());
				
				if ((commandInt + 1) <= (commandList.size()-1)) {
					btnNewButton_1.setText(commandList.get(commandInt+1).GetName());
				}
				else {
					btnNewButton_1.setText(commandList.get(0).GetName());
				}
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(534, 501, 150, 21);
		add(btnNewButton_1);
		
		JLabel SteeringWheel = new JLabel("");
		SteeringWheel.setBounds(331, 237, 70, 70);
		
		steeringWheel = SteeringWheel;
		add(SteeringWheel);
		
		JLabel TurnSignals = new JLabel("");
		TurnSignals.setBounds(300, 187, 125, 40);
		signal = TurnSignals;
		add(TurnSignals);
		
		JLabel WindshieldWipers = new JLabel("");
		WindshieldWipers.setBounds(58, 30, 674, 114);
		windShield = WindshieldWipers;
		add(WindshieldWipers);
		
		JLabel DVDTray = new JLabel("");
		DVDTray.setBounds(314, 320, 111, 32);
		DVD = DVDTray;
		add(DVDTray);
		
		JLabel GasPedal = new JLabel("");
		GasPedal.setBounds(365, 377, 70, 70);
		gasPedal = GasPedal;
		add(GasPedal);
		
		JLabel BrakePedal = new JLabel("");
		BrakePedal.setBounds(278, 377, 70, 70);
		brakePedal = BrakePedal;
		add(BrakePedal);
		
		JLabel Transmission = new JLabel("");
		Transmission.setBounds(494, 294, 45, 100);
		transmission = Transmission;
		add(Transmission);
		
		JLabel ParkingBrake = new JLabel("");
		ParkingBrake.setBounds(216, 294, 45, 100);
		parkingBrake = ParkingBrake;
		add(ParkingBrake);
		
		JLabel CarLock = new JLabel("");
		CarLock.setBounds(216, 237, 45, 45);
		carLock = CarLock;
		add(CarLock);
		
		JLabel CarDoor = new JLabel("");
		CarDoor.setBounds(21, 213, 150, 230);
		carDoor = CarDoor;
		add(CarDoor);
		
		InitializeAllVisuals();

	}
	
	public void InitializeResources() {
		steering = new SteeringWheelCommand();
		transmissionShift = new TransmissionCommand();
		signalLights = new SignalsLightCommand();
		dvdCommand = new DVDTrayCommand();
		wipers = new WindShieldCommand();
		pedal = new GasPedalCommand();
		brake = new BrakePedalCommand();
		parking = new ParkingBrakeCommand();
		lock = new CarLockCommand();
		door = new CarDoorCommand();
		
		commandList.add(steering);
		commandList.add(transmissionShift);
		commandList.add(signalLights);
		commandList.add(dvdCommand);
		commandList.add(wipers);
		commandList.add(pedal);
		commandList.add(brake);
		commandList.add(parking);
		commandList.add(lock);
		commandList.add(door);
	}
	
	public void InitializeAllVisuals() {
		steering.Initialize();
		transmissionShift.Initialize();
		signalLights.Initialize();
		dvdCommand.Initialize();
		wipers.Initialize();
		pedal.Initialize();
		brake.Initialize();
		parking.Initialize();
		lock.Initialize();
		door.Initialize();
	}
	
	public static void ChangeImage(String imageName, JLabel labelToChange) throws IOException {
		String currentPath = new java.io.File(".").getCanonicalPath();
		String imagePath = currentPath + "\\src\\Images\\"+imageName;
		ImageIcon imgThisImg = new ImageIcon(imagePath);

		labelToChange.setIcon(imgThisImg);
	}
	
	public static void ChangeSteeringWheel(String imageName) throws IOException {
		ChangeImage(imageName, steeringWheel);
		
	}
	
	public static void ChangeTransmission(String imageName) throws IOException {
		ChangeImage(imageName, transmission);
		
	}
	
	public static void ChangeSignal(String imageName) throws IOException {
		ChangeImage(imageName, signal);
	}
	
	public static void ChangeDVD(String imageName) throws IOException {
		ChangeImage(imageName, DVD);
	}
	
	public static void ChangeWipers(String imageName) throws IOException {
		ChangeImage(imageName, windShield);
	}
	
	public static void ChangeGasPedal(String imageName) throws IOException {
		ChangeImage(imageName, gasPedal);
	}
	
	public static void ChangeBrakePedal(String imageName) throws IOException {
		ChangeImage(imageName, brakePedal);
	}
	
	public static void ChangeParkingBrake(String imageName) throws IOException {
		ChangeImage(imageName, parkingBrake);
	}
	
	public static void ChangeCarLock(String imageName) throws IOException {
		ChangeImage(imageName, carLock);
	}
	
	public static void ChangeCarDoor(String imageName) throws IOException {
		ChangeImage(imageName, carDoor);
	}
	
	
	
	
}
