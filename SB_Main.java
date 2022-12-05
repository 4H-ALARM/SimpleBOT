package SB;

import java.util.Scanner;

public class SB_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor dm1 = new Motor("frontLeft");
		Motor dm2 = new Motor("frontRight");
		Motor dm3 = new Motor("rearLeft");
		Motor dm4 = new Motor("rearRight");
		// DriveTrain dt = new DriveTrain();

		// Start stopped
		dm1.setSpeed(0);
		dm2.setSpeed(0);
		dm3.setSpeed(0);
		dm4.setSpeed(0);
		//dt.stop();
		
		// set forward or back or end
		Scanner input = new Scanner(System.in);
	    String stop = "s";
	    String forward = "f";
	    String backward = "b";
		while(true){	    
		    String direction = input.next();
		    // dt.drive(direction);
		    // dt.updateSensors();
		        
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
		// dt.stop();
	}

}
