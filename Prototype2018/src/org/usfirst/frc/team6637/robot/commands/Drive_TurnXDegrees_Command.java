package org.usfirst.frc.team6637.robot.commands;

import org.usfirst.frc.team6637.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive_TurnXDegrees_Command extends Command {

	public double degrees, speed, startingAngle, targetAngle;
	
    public Drive_TurnXDegrees_Command(double degreesToRotate, double turningSpeed) {
    		requires(Robot.driveSubsystem);
    		degrees = degreesToRotate;
    		speed = turningSpeed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		startingAngle = Robot.gyro.getAngle();
    		targetAngle = startingAngle + degrees;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	 if(targetAngle > startingAngle) {
    		 Robot.driveSubsystem.setPower(speed, -speed);
    	 } else {
    		 Robot.driveSubsystem.setPower(-speed, speed);
    	 }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
		double currentAngle = Robot.gyro.getAngle();
		if(targetAngle > startingAngle) {
			if(currentAngle > targetAngle) {
				return true; 
			}
		} else {
			if(currentAngle < targetAngle) {
				return true;
			}
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
