package org.usfirst.frc.team2854.robot.commands;

import org.usfirst.frc.team2854.robot.subsystems.Elevation.ElevationConfig;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class FullAuto extends CommandGroup {
    
    public  FullAuto() {
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
    	addSequential(new DriveForward(4096));
    	addSequential(new ElevationMoveTo(ElevationConfig.Setpoint.MID));
    	addSequential(new DriveTurn(true));
    	addSequential(new DriveForward(4096));
    }
}
