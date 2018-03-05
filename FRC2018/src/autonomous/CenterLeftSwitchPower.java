package autonomous;

import org.usfirst.frc.team5468.robot.Hardware;
import templates.AutoProgram;

public class CenterLeftSwitchPower extends AutoProgram{
	
	public CenterLeftSwitchPower(Hardware r) {
		super(r, "WLCP");
	}
	
	@Override
	public void addActions() {
		commands.addMastT(10);
		commands.addSequence(0, 1);
		
		commands.addForwardT(.8, .4);
		commands.addRotationGyro(-42.7);
		commands.addForwardT(1, .5);
		commands.addRotationGyro(42.7);
		commands.addForwardT(1, .3);
		commands.addExtend();
		commands.addClamp();
		commands.addSequence(0, 2);
	}
}
