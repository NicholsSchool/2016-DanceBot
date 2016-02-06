// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4930.DanceBot2016.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4930.DanceBot2016.Robot;
import org.usfirst.frc4930.DanceBot2016.RobotMap;

/**
 *
 */
public class TankDrive extends Command {
	
    public static Encoder leftDriveTrainEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
    public static Encoder rightDriveTrainEncoder = new Encoder(2, 3, false, Encoder.EncodingType.k4X);
    
    //public static String leftEncoderDistance;
    //public static String rightEncoderDistance;
    
    
    public TankDrive() {
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    leftDriveTrainEncoder.reset();
    rightDriveTrainEncoder.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.tankDrive(Robot.oi.getJoystick0(), Robot.oi.getJoystick1());
    	
    	//leftEncoderDistance = "" + leftDriveTrainEncoder.getDistance();
    	//rightEncoderDistance = "" + rightDriveTrainEncoder.getDistance();
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
