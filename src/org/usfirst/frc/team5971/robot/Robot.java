//this code was made by Quade Leonard

package org.usfirst.frc.team5971.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	RobotDrive myRobotDriver;

	Button button1;
	Joystick stick;
	int counterLoop;
	int counterLoop2;
	int counterLoop3;
	int counterLoop4;
	int counterLoop5;
	int counterLoop6;
	Joystick leftJoy;
	static Subsystem ropeClimber;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    
    	leftJoy = new Joystick (0);
    	button1= new JoystickButton (leftJoy, 6);
    	myRobotDriver = new RobotDrive(0,2,1,3);

    	stick = new Joystick(0);
    	myRobotDriver.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    	myRobotDriver.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
    	myRobotDriver.setInvertedMotor(RobotDrive.MotorType.kRearLeft,true);
    	myRobotDriver.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    	ropeClimber= new RopeClimber();
    }
    
    /**
     * This function is run once each time the robot enters autonomous mode
     */
    public void autonomousInit(){
    	counterLoop = 20;
    	counterLoop2 = 60;
    	counterLoop3 = 0;
    	counterLoop4 = 0;
    	counterLoop5 = 0;
    	counterLoop6 = 0;
    }


    /**
     * This function is called periodically during autonomous
     * 1ft = 20 ticks at 0.25 speed
     * 90 degrees = 200 ticks at 0.25 speed, 0.58 curve
     */
    
    public void autonomousPeriodic() {
    	
    if (counterLoop<0);
    	myRobotDriver.drive(-0.25, 0.0);
    	
    }
    	
    /**
     * This function is called once each time the robot enters tele-operated mode
     */
    public void teleopInit(){
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        myRobotDriver.arcadeDrive(stick);
       button1.whenPressed(new driveUp());
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	LiveWindow.run();
    }
    
}
