package org.usfirst.frc4930.DanceBot2016.commands;

import org.usfirst.frc4930.DanceBot2016.OI;
import org.usfirst.frc4930.DanceBot2016.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.CameraServer;

public class SwitchCams extends Command {

	
//	public CANTalon motor1 = new CANTalon(2);

	
	CameraServer server;
	boolean camera0;
	
    public SwitchCams() {
    	server = CameraServer.getInstance();
        server.setQuality(50);
        server.startAutomaticCapture("cam0");
        camera0 = true;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    	cameraSwitch();
    	System.out.println("Executed");
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
    
    private void cameraSwitch() {
    	if(camera0) {
    		server.startAutomaticCapture("cam1");
    		camera0 = false;
    		isFinished();
    	}
    	else if(!camera0){
    		server.startAutomaticCapture("cam0");
    		camera0 = true;
    		isFinished();
    	}
    	
    	
    }
}