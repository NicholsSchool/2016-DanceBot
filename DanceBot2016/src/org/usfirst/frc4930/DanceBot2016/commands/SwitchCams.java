package org.usfirst.frc4930.DanceBot2016.commands;

import edu.wpi.first.wpilibj.command.Command;

public class SwitchCams extends Command {

	
//	public CANTalon motor1 = new CANTalon(2);

	
	
    public SwitchCams() {
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Cameras._cam0 == true) {
    		Cameras.changeCam(Cameras.backCam);
    		Cameras._cam0 = false;
    		
    	}
    	
    	else if (Cameras._cam0 == false) {
    		Cameras.changeCam(Cameras.frontCam);
    		Cameras._cam0 = true;
    	}
    }


	// Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
}