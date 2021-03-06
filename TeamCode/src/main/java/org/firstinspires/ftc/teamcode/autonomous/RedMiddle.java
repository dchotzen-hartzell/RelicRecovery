package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

/**
 * Created by dchotzen-hartzell19 on 10/21/17.
 */


@Autonomous(name="Red Middle", group="Red")
public class RedMiddle extends AutonomousOpMode {

	@Override public void run() {
		//RelicRecoveryVuMark v = getVision();
		senseRedTurn();
		sleep(1000);
		driveNew(8, 0.3, 3);
		driveUntilFlat(3, 0.3);
		driveNew(2, 0.3, 3);
        /*switch (v) {
            case CENTER:
                driveNew(6, 0.2, 2);
            case RIGHT:
                driveNew(12, 0.2, 2);
        }*/
		sleep(1000);
		turnUntilHeading(90, 0.3, 1, 4);
		sleep(250);
		driveNew(10, 0.3, 3);
		sleep(250);
		turnUntilHeading(180, 0.3, 1, 3);
		sleep(500);
        depositBlock();
	}
}
