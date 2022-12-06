package SB;

import java.util.Scanner;

public class SB_Main {

	public static void main(String[] args) {
		DriveTrain dt = new DriveTrain();
		Arm a = new Arm();
		Scanner input = new Scanner(System.in);
		
		// start by making sure everything is stopped
		dt.stop();
		a.stop();
		
		// loop collecting user input
		while(true){	    
		    String direction = input.next();
		    // command the subsystems, only one command at a time
		    dt.drive(direction);
		    a.move(direction);		    
		    // update subsystem sensors
		    dt.updateSensors();
		    a.updateSensor();
		        
		    if(Commands.stop.compareTo(direction) == 0)
		        break;
		}
		
		// end while making sure everything is stopped
		dt.stop();
		a.stop();
	}

}
