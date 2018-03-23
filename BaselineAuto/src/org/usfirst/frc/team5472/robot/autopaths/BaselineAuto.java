package org.usfirst.frc.team5472.robot.autopaths;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class BaselineAuto extends Command{
	
	private boolean completed;
	private double starttime;
	
	public void initialize() {
		starttime = Timer.getFPGATimestamp();
	}
	
	
	public void execute() {
		if(Timer.getFPGATimestamp() - starttime <= 4.0) {
			//drive.drive(0.5)
		}else {
			//drive.drive(0);
			completed = true;
		}
		
	}
	
	
	@Override
	protected boolean isFinished() {
		return completed;
	}

	
	
	
}
