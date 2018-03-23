package org.usfirst.frc.team5472.robot;

import org.usfirst.frc.team5472.robot.autopaths.*;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends TimedRobot {
	
	Command autoCommand;
	SendableChooser<Command> autoChooser;
	
	@Override
	public void robotInit() {
		autoChooser = new SendableChooser<Command>();
		autoChooser.addDefault("CrossBaseLine", new BaselineAuto());
		SmartDashboard.putData("Chooser", autoChooser);
	}

	@Override
	public void autonomousInit() {
		autoCommand = autoChooser.getSelected();
		
		autoCommand.start();
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopPeriodic() {
	}

	@Override
	public void testPeriodic() {
	}
}
