package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="autopilot-mode")

public class autopilot extends LinearOpMode {

    private DcMotor left;
    private DcMotor right;

    private DcMotor claw1;

    private int leftPos;
    private int rightPos;

    @Override
    public void runOpMode() {
        left = hardwareMap.get(DcMotor.class, "motor-RL");
        right = hardwareMap.get(DcMotor.class, "motor-RR");
        claw1 = hardwareMap.get(DcMotor.class, "claw-1");

        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        right.setDirection(DcMotorSimple.Direction.REVERSE);

        leftPos = 0;
        rightPos = 0;

        waitForStart();

        drive(1000,1000,0.25);
        drive(1000,-1000,0.25);
    }
    private void drive(int leftTarget, int rightTarget, double speed) {
        leftPos += leftTarget;
        rightPos += rightTarget;

        left.setTargetPosition(leftPos);
        right.setTargetPosition(rightPos);

        left.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        right.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        left.setPower(speed);
        right.setPower(speed);

        while(opModeIsActive() && left.isBusy() && right.isBusy()) {
            idle();
        }
    }
}
