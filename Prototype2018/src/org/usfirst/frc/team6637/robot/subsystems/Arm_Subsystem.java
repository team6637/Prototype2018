package org.usfirst.frc.team6637.robot.subsystems;

import org.usfirst.frc.team6637.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Arm_Subsystem extends Subsystem {

    public Spark Arm = new Spark(RobotMap.ArmSpark);
    public static final double armSpeed = 0.5;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void rotateForward() {
    		Arm.set(armSpeed);
    }
    
    public void rotateBack() {
    		Arm.set(-armSpeed);
    }
    
    public void stop() {
    		Arm.set(0.0);
    }
}

