package com.sasrobotics.FRC2014.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    //pwm ports
    public static final int leftMotor = 1;
    public static final int rightMotor = 2;
    public static final int launcher = 4;
    
    
    public static final int lowerLimitSwitch = 1;
    public static final int upperLimitSwitch = 2;
    
    //relay ports
    public static final int intake1 = 1;
    public static final int intake2 = 2;
    
}
