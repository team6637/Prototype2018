package org.usfirst.frc.team6637.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	// PWM?
	public static final int LVictor = 2;
	public static final int RVictor = 1;
	public static final int ArmVictor = 3;
	
	// DriveStation
	public static final int Joystick = 0;
	
	// DIO
	public static final int leftWheelEncoderA = 0;
	public static final int leftWheelEncoderB = 1;
	public static final int rightWheelEncoderA = 2;
	public static final int rightWheelEncoderB = 3;
	
}