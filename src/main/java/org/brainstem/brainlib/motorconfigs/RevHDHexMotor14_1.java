package org.brainstem.brainlib.motorconfigs;

import com.qualcomm.robotcore.hardware.configuration.MotorType;

import org.firstinspires.ftc.robotcore.external.navigation.Rotation;

//Modification of REV HD HEX Motor gearbox
//Uses 7:1 planetary gearbox to 2:1 bevel gear reduction
//Effectively a 14:1 reduction
@MotorType(xmlTag = "RevHdHex14_1", name = "REV HD Hex 14:1 Motor", ticksPerRev = 392, gearing = 14, maxRPM = 428, orientation = Rotation.CCW)
public interface RevHDHexMotor14_1
{
}