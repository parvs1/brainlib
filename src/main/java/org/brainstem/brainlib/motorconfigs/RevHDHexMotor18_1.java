package org.brainstem.brainlib.motorconfigs;

import com.qualcomm.robotcore.hardware.configuration.MotorType;

import org.firstinspires.ftc.robotcore.external.navigation.Rotation;

//Modification of REV HD HEX Motor gearbox
//Uses 7:1 planetary gearbox to 2:1 bevel gear reduction
//Effectively a 14:1 reduction
@MotorType(xmlTag = "RevHdHex18_1", name = "REV HD Hex 18:1 Motor", ticksPerRev = 504, gearing = 18, maxRPM = 428, orientation = Rotation.CCW)
public interface RevHDHexMotor18_1
{
}