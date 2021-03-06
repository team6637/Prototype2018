package org.usfirst.frc.team6637.robot;

import org.usfirst.frc.team6637.robot.commands.Arm_Extend_Command;
import org.usfirst.frc.team6637.robot.commands.Arm_Retract_Command;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);
	// button.whenPressed(new ExampleCommand());
	// button.whileHeld(new ExampleCommand());
	// button.whenReleased(new ExampleCommand());
	
	public Joystick joystick = new Joystick(RobotMap.Joystick);
	Button armExtendButton = new JoystickButton(joystick, 1);
	Button armRetractButton = new JoystickButton(joystick, 2);
	
	public OI() {
		armExtendButton.whileHeld(new Arm_Extend_Command());
		armRetractButton.whileHeld(new Arm_Retract_Command());
	}
	
}
