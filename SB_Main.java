package SB;

import java.util.Scanner;

public class SB_Main {

	public static void main(String[] args) {
		DriveTrain dt = new DriveTrain();
		Arm a = new Arm();
		Scanner input = new Scanner(System.in);
		String command = "";
		
		// start by making sure everything is stopped
		dt.stop();
		a.stop();
		
		// loop collecting user input
		while(true){	    
			command = input.next();
		    // command the subsystems, only one command at a time
		    dt.drive(command);
		    a.move(command);		    
		    // update subsystem sensors
		    dt.updateSensors();
		    a.updateSensor();
		    // break out of loop if command is stop
		    if(Commands.stop.compareTo(command) == 0)
		        break;
		}
		
		// end while making sure everything is stopped
		dt.stop();
		a.stop();
	}

}
