package org.usfirst.frc.team6637.robot.commands;

import org.usfirst.frc.team6637.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Drive_GoStraight_Command extends Command {
	
	public double Kp = 0.03;
	public double feet;
	
    public Drive_GoStraight_Command(double feetToDrive) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveSubsystem);
    		feet = feetToDrive;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		Robot.gyro.reset();
		Robot.driveTrainEncoders.resetEncoders();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		double angle = Robot.gyro.getAngle();
    		Robot.driveSubsystem.autonDrive(1.0, -angle*Kp); // drive towards heading 0
		Timer.delay(0.004);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(Robot.driveTrainEncoders.getAverageDistance() >= feet) {
        		return true;
        }
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
