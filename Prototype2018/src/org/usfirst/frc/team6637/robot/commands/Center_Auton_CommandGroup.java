package org.usfirst.frc.team6637.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Center_Auton_CommandGroup extends CommandGroup {

    public Center_Auton_CommandGroup() {
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
		
		// Right Side of Switch is ours
		if(gameData.charAt(0) == 'R'){
			
			//12 feet minus length of bot and bumpers
			addSequential(new Drive_GoStraight_Command(120.0, 0.5, 36.0));
		
		// Left Side of Switch is ours
		} else if(gameData.charAt(0) == 'L') {
			
			addSequential(new Drive_GoStraight_Command(24.0, 0.5, 6.0));
			
			addSequential(new Drive_TurnToAngle_Command(-90.0));
			
			addSequential(new Drive_GoStraight_Command(11.0, 0.5, 40.0));
			
			addSequential(new Drive_TurnToAngle_Command(90.0));
			
			addSequential(new Drive_GoStraight_Command(88.0, 0.5, 24.0));
		}
		
    }
}

		
    



    

   
