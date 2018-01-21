package org.usfirst.frc.team6637.robot.subsystems;

import org.usfirst.frc.team6637.robot.RobotMap;
import org.usfirst.frc.team6637.robot.commands.Drive_Arcade_Command;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drive_Subsystem extends Subsystem {

	private Victor VLeft, VRight;
	private DifferentialDrive drive;
	
	public Drive_Subsystem() {
		VLeft = new Victor(RobotMap.LVictor);
		VRight = new Victor(RobotMap.RVictor);
		drive = new DifferentialDrive(VLeft, VRight);
	}
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Drive_Arcade_Command());
    }
	
	public void autonDrive(double move, double turn, boolean isTurning) {
		drive.curvatureDrive(move, turn, isTurning);
	}
	
	public void teleopDrive(double move, double turn) {
		drive.arcadeDrive(move, turn);
	}
	
	public void setPower(double leftPower, double rightPower) {
		drive.tankDrive(leftPower, rightPower);
	}
	
	public void stop() {
		drive.tankDrive(0.0, 0.0);
	}
	
}

