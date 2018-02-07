package org.usfirst.frc3098.RobotTemplate.util;

public class JoystickAxisScaling {
	
	public static double getY(double joystickInput, double inputMinimum, double outputMinimum, 
											double inputMaximum, double outputMaximum) {
		double x = joystickInput, y = 10.0, slope, yIntercept, deadband = 0.1;
		
		if (joystickInput > 0)
		{
			inputMinimum = inputMinimum + deadband;
		}

		else
		{
			inputMinimum = inputMinimum - deadband;
			inputMaximum = -inputMaximum;
			outputMinimum = -outputMinimum;
			outputMaximum = -outputMaximum;
		}
		
		if (inputMinimum != inputMaximum)
		{
			if (outputMinimum == outputMaximum)
			{
				slope = 0;
				yIntercept = outputMinimum;
				y = yIntercept;
			} 
			
			else if (joystickInput <= deadband && joystickInput >= -deadband)
			{
				y = 0;
			}
			
			else 
			{
				slope = (outputMinimum-outputMaximum)/(inputMinimum-inputMaximum);
				yIntercept =  outputMinimum - (slope*inputMinimum);
				y = (slope*x) + yIntercept;
			}
		}
		
		return y;
	}
}


