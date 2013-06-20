package lawsn;

import java.awt.Color;

import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 * LawsnBot - a robot by (your name here)
 */
public class LawsnBot extends Robot
{
	/**
	 * run: LawsnBot's default behavior
	 */
	public void run() {

		/* BODY, GUN, RADAR */
		setColors(Color.white, Color.black, Color.cyan);

		// Robot main loop
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}
	
	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		fire(2);
	}
	
}
