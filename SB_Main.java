package SB;

import java.util.Scanner;

public class SB_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriveMotor dm1 = new DriveMotor("frontLeft");
		DriveMotor dm2 = new DriveMotor("frontRight");
		DriveMotor dm3 = new DriveMotor("rearLeft");
		DriveMotor dm4 = new DriveMotor("rearRight");
		//DriveTrain dt = new DriveTrain();

		// Start stopped
		dm1.setSpeed(0);
		dm2.setSpeed(0);
		dm3.setSpeed(0);
		dm4.setSpeed(0);
		
		// set forward or back or end
		Scanner input = new Scanner(System.in);
	    String stop = "s";
	    String forward = "f";
	    String backward = "b";
		while(true){	    
		    String direction = input.next();
		    // dt.drive(direction);
		        
		    if(stop.compareTo(direction) == 0)
		        break;
		    else {
		        if(forward.compareTo(direction) == 0) {
		        	dm1.setSpeed(1);
		    		dm2.setSpeed(1);
		    		dm3.setSpeed(1);
		    		dm4.setSpeed(1);
		        }
		        if(backward.compareTo(direction) == 0) {
		        	dm1.setSpeed(-1);
		    		dm2.setSpeed(-1);
		    		dm3.setSpeed(-1);
		    		dm4.setSpeed(-1);
		        }
		    }
		}
		
		// End stopped
		dm1.setSpeed(0);
		dm2.setSpeed(0);
		dm3.setSpeed(0);
		dm4.setSpeed(0);
	}

}
