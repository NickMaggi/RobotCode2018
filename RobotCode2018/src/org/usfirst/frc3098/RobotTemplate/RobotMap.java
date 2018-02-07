


package org.usfirst.frc3098.RobotTemplate;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static WPI_TalonSRX driveTrainLeftFrontTalon;
    public static WPI_TalonSRX driveTrainLeftBackTalon;
    public static WPI_TalonSRX driveTrainRightFrontTalon;
    public static WPI_TalonSRX driveTrainRightBackTalon;
    public static WPI_TalonSRX driveTrainLeftMiddleTalon;
    public static WPI_TalonSRX driveTrainRightMiddleTalon;


    public static void init() {
        driveTrainLeftFrontTalon = new WPI_TalonSRX(10);        
        driveTrainLeftMiddleTalon = new WPI_TalonSRX(11);       
        driveTrainLeftBackTalon = new WPI_TalonSRX(12);        
        driveTrainRightFrontTalon = new WPI_TalonSRX(15);        
        driveTrainRightMiddleTalon = new WPI_TalonSRX(16);
        driveTrainRightBackTalon = new WPI_TalonSRX(17);       
           
       

    }
}
