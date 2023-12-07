package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;



@TeleOp(name="motor-0")
public class Motor extends OpMode {

    DcMotor motor;
    DcMotor motor2;

    DcMotor claw1;
    DcMotor claw2;


    @Override
    public void init()
    {
        motor2 = hardwareMap.get(DcMotor.class, "motor-RL");
        motor = hardwareMap.get(DcMotor.class, "motor-RR");
        claw1 = hardwareMap.get(DcMotor.class, "claw-1");
        claw2 = hardwareMap.get(DcMotor.class, "claw-2");
    }

    public void loop()
    {
        // Setup 'gamepad' eventually.
        // Left Trigger = Forward
        // Right trigger = Backward

        // Movements

            motor.setPower(gamepad1.right_stick_y);
            motor.setPower(gamepad1.right_stick_y);
            motor2.setPower(gamepad1.right_stick_x);
            motor2.setPower(gamepad1.right_stick_y);
            motor2.setDirection(DcMotorSimple.Direction.REVERSE);


            claw1.setPower(gamepad1.left_stick_y);
            claw2.setPower(gamepad1.left_stick_y);
        // End of movements


    }

}
