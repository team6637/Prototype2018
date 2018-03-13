package org.usfirst.frc.team6637.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Left_Auton_CommandGroup extends CommandGroup {

    public Left_Auton_CommandGroup() {


        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if(gameData.charAt(0) == 'L'){ 
			
			//SWITCH IS OURS
			
			//drive forward 14 feet - 168 inches
			addSequential(new Drive_GoStraight_Command(160.0, 0.5, 24.0));
	
			// turn right
			addSequential(new Drive_TurnToAngle_Command(90.0));
			
			// drive forward 1 foot
			addSequential(new Drive_GoStraight_Command(12.0, 0.4, 5.0));
		
			// drop cube
			
		}else if(gameData.charAt(1) == 'L') {
			
			// SCALE IS OURS
			
			//drive forward 27 feet - 324 inches
			addSequential(new Drive_GoStraight_Command(320.0, 0.5, 24.0));
			
			// turn right
			addSequential(new Drive_TurnToAngle_Command(90.0));
			
			// drive forward 1 foot
			addSequential(new Drive_GoStraight_Command(12.0, 0.35, 5.0));
			
		} else {
			
			// NEITHER IS OURS - Go through the alley
			
			// drive forward 20.5 feet - 246 inches
			addSequential(new Drive_GoStraight_Command(246.0, 0.5, 24.0));
			
			// turn right
			addSequential(new Drive_TurnToAngle_Command(90.0));
			
			// drive forward feet - inches
			//addSequential(new Drive_GoStraight_Command(100.0, 0.4, 24.0));
    
    	}
    }
}
