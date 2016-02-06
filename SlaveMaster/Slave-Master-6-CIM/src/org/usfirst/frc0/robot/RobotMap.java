// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc0.robot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.RobotDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainLeftFront;
    public static CANTalon driveTrainRightFront;
    public static CANTalon driveTrainLeftMiddle;
    public static CANTalon driveTrainRightMiddle; 
    public static CANTalon driveTrainLeftBack;
    public static CANTalon driveTrainRightBack;
    public static RobotDrive driveTrainRobotDrive2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftFront = new CANTalon(0);
        LiveWindow.addActuator("DriveTrain", "LeftFront", driveTrainLeftFront);
        
        driveTrainRightFront = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "RightFront", driveTrainRightFront);
        
        driveTrainLeftMiddle = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "LeftMiddle", driveTrainLeftMiddle);
        
        driveTrainRightMiddle = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "RightMiddle", driveTrainRightMiddle);
        
        driveTrainLeftBack = new CANTalon(4);
        LiveWindow.addActuator("DriveTrain", "LeftBack", driveTrainLeftBack);
        
        driveTrainRightBack = new CANTalon(5);
        LiveWindow.addActuator("DriveTrain", "RightBack", driveTrainRightBack);
        
        
        driveTrainRobotDrive2 = new RobotDrive(driveTrainLeftFront, driveTrainRightFront);
        
        driveTrainRobotDrive2.setSafetyEnabled(true);
        driveTrainRobotDrive2.setExpiration(0.1);
        driveTrainRobotDrive2.setSensitivity(0.5);
        driveTrainRobotDrive2.setMaxOutput(1.0);
        
        
        //LeftFront is the master CIM
        //LeftMiddle and LeftBack are the slave CIMs
        driveTrainLeftMiddle.changeControlMode(TalonControlMode.Follower);
        driveTrainLeftMiddle.set(driveTrainLeftFront.getDeviceID());
        //driveTrainLeftMiddle.reverseOutput( true );
        
        driveTrainLeftBack.changeControlMode(TalonControlMode.Follower);
        driveTrainLeftBack.set(driveTrainLeftFront.getDeviceID());
        //driveTrainLeftBack.reverseOutput( true );
        
        //RightFront is the master CIM
        //RightMiddle and RightBack are the slave CIMs
        driveTrainRightMiddle.changeControlMode(TalonControlMode.Follower);
        driveTrainRightMiddle.set(driveTrainRightFront.getDeviceID());
        //driveTrainRightMiddle.reverseOutput( true );
        
        driveTrainRightBack.changeControlMode(TalonControlMode.Follower);
        driveTrainRightBack.set(driveTrainRightFront.getDeviceID());
        //driveTrainRightBack.reverseOutput( true );

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
}
