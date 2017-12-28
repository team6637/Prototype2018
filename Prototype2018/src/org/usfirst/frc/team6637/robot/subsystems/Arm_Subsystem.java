package org.usfirst.frc.team6637.robot.subsystems;

import org.usfirst.frc.team6637.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Arm_Subsystem extends Subsystem {

    public Victor Arm = new Victor(RobotMap.ArmVictor);
    public static final double armSpeed = 1;

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

