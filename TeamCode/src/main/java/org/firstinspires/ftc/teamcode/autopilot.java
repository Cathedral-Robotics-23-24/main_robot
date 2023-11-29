package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="autopilot-mode")

public class autopilot extends OpMode {
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
        motor.setPower(1);
        motor2.setPower(1);
    }
}
