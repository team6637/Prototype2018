package org.usfirst.frc.team6637.robot.subsystems;

import org.usfirst.frc.team6637.robot.RobotMap;
import org.usfirst.frc.team6637.robot.commands.Drive_Arcade_Command;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive_Subsystem extends Subsystem {

	private Victor VLeft, VRight;
	private RobotDrive drive;
	
	public Drive_Subsystem() {
		VLeft = new Victor(RobotMap.LVictor);
		VRight = new Victor(RobotMap.RVictor);
		drive = new RobotDrive(VLeft, VRight);
	}
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Drive_Arcade_Command());
    }
	
	public void autonDrive(double move, double turn) {
		drive.drive(move, turn);
	}
	
	public void teleopDrive(double move, double turn) {
		drive.arcadeDrive(move, turn);
	}
	
	public void setPower(double leftPower, double rightPower) {
		drive.tankDrive(leftPower, rightPower);
	}
	
	public void stop() {
		drive.drive(0.0, 0.0);
	}
	
}

