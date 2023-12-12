package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;



@TeleOp(name="motor-0")
public class Motor extends OpMode {

    DcMotor motor;
    DcMotor motor2;
    DcMotor claw;
    DcMotor claw2;

    Servo claw_hand;

    Servo extension_claw;


    @Override
    public void init()
    {
        motor2 = hardwareMap.get(DcMotor.class, "motor-RL");
        motor = hardwareMap.get(DcMotor.class, "motor-RR");

        claw = hardwareMap.get(DcMotor.class, "claw-1");
        claw2 = hardwareMap.get(DcMotor.class, "claw-2");

        claw_hand = hardwareMap.get(Servo.class, "claw-servo");
        extension_claw = hardwareMap.get(Servo.class, "extend-servo");

    }

    public void loop()
    {
        motor.setPower(gamepad1.right_stick_x);
        motor2.setPower(gamepad1.right_stick_x);

        motor.setPower(gamepad1.right_stick_y);
        motor2.setPower(gamepad1.right_stick_y);

        if (gamepad1.a)
        {
            claw_hand.setPosition(0.85);

        } else if (gamepad1.b)
        {
            claw_hand.setPosition(0);
        }


        extension_claw.setPosition(gamepad1.right_trigger);
    }

}
