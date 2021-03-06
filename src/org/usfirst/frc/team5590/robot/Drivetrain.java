// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc.team5590.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * DriveTrain is the Subsystem for the left and right tracks of the robot to
 * move it around the playing field.
 */
public class Drivetrain extends Subsystem {
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	SpeedController leftTrack = RobotMap.drivetrainLeftTrack;
	SpeedController rightTrack = RobotMap.drivetrainRightTrack;
	RobotDrive robotDrive2 = RobotMap.drivetrainRobotDrive21;

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	/**
	 * @param left takes left joystick between (-1, 1)
	 * 
	 * @param right takes right joystick position between (-1, 1) --Drives robot
	 * using the joysticks
	 */
	public void takeJoystickInput(double left, double right) {
		robotDrive2.tankDrive(left, (right));
	}

	/**
	 * @param speed is the set speed (method used in autonomous or for testing
	 * purposes.
	 */
	public void setSpeed(double speed) {
			robotDrive2.tankDrive(speed, (speed));
	}

	/**
	 * @param speed is the speed for the right track to move, left track moves
	 * at half of that, turning robot counterClockwise
	 */
	public void rotateLeft(double speed) {
		robotDrive2.tankDrive(-speed, speed);
	}

	/**
	 * @param speed is the speed for the left track to move, right track moves
	 * at half of that, turning robot Clockwise
	 */
	public void rotateRight(double speed) {
		robotDrive2.tankDrive(speed, -speed);
	}

	// Sets speeds back to zero for both tracks
	public void stop() {
		robotDrive2.drive(0, 0);
	}

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
		// Robot will start in the stop position unless new command called.

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
