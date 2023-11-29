package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;



@TeleOp(name="motor-0")
public class Motor extends OpMode {

    DcMotor motor;
    DcMotor motor2;


    @Override
    public void init()
    {
        motor2 = hardwareMap.get(DcMotor.class, "motor-RL");
        motor = hardwareMap.get(DcMotor.class, "motor-RR");

    }

    public void loop()
    {
        // Setup 'gamepad' eventually.
        // Left Trigger = Forward
        // Right trigger = Backward

        // Backward
        motor.setPower(gamepad1.right_trigger);
        motor2.setPower(gamepad1.right_trigger);
        motor.setDirection(DcMotorSimple.Direction.REVERSE);
        motor2.setDirection(DcMotorSimple.Direction.FORWARD);

        // Forward
        motor.setPower(gamepad1.left_trigger);
        motor2.setPower(gamepad1.left_trigger);

        motor.setDirection(DcMotorSimple.Direction.FORWARD);
        motor2.setDirection(DcMotorSimple.Direction.REVERSE);

        

    }

}
