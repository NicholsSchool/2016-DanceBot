package org.usfirst.frc4930.DanceBot2016.commands;


import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.CameraServer;

public class Cameras {
	
	static boolean _cam0 = true; 
	
	static public int frontCam;
	static public int backCam;
	private static int curCam;
	private Image frame;
	private CameraServer server;
	
	public Cameras() {
		frontCam = NIVision.IMAQdxOpenCamera("cam0", NIVision.IMAQdxCameraControlMode.CameraControlModeController);
        backCam = NIVision.IMAQdxOpenCamera("cam1", NIVision.IMAQdxCameraControlMode.CameraControlModeController);
        curCam = frontCam;
        
        frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
        server = CameraServer.getInstance();
        server.setQuality(50);

	}
	
	public static void changeCam(int newId) {
		if(curCam == frontCam){
		NIVision.IMAQdxStopAcquisition(frontCam);
		curCam = backCam;
		NIVision.IMAQdxConfigureGrab(backCam);
    	NIVision.IMAQdxStartAcquisition(backCam);
    	
		}
		else if(curCam == backCam){
			NIVision.IMAQdxStopAcquisition(backCam);
			curCam = frontCam;
	    	NIVision.IMAQdxConfigureGrab(frontCam);
	    	NIVision.IMAQdxStartAcquisition(frontCam);
	    	
		}
    }
	
	public void updateCam() {
    	NIVision.IMAQdxGrab(curCam, frame, 1);
        server.setImage(frame);
    }
	
	public void init() {
		changeCam(frontCam);
	}
	
	
}
