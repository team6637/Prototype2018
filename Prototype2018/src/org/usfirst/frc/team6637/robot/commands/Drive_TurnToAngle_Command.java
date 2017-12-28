package org.usfirst.frc.team6637.robot.commands;

import org.usfirst.frc.team6637.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive_TurnToAngle_Command extends Command {

	public double angle, degreesToGo;
	
    public Drive_TurnToAngle_Command(double newAngle) {
    		requires(Robot.driveSubsystem);
    		angle = newAngle;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		Robot.gyro.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		double currentAngle = Robot.gyro.getAngle();
		degreesToGo = angle - currentAngle;
		double speed = degreesToGo / 45.0 * .75;
		Robot.driveSubsystem.setPower(-speed, speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
		if (Math.abs(degreesToGo) < 3) {
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
