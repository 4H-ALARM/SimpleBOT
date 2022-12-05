package SB;

public class DriveTrain {
	
	DriveMotor m_fL;
	DriveMotor m_fR;
	DriveMotor m_rL;
	DriveMotor m_rR;
	
	
	public DriveTrain() {
		m_fL = new DriveMotor("frontLeft");
		m_fR = new DriveMotor("frontRight");
		m_rL= new DriveMotor("rearLeft");
		m_rR= new DriveMotor("rearRight");
	}
	
	public void drive(String direction) {
		String stop = "s";
	    String forward = "f";
	    String backward = "b";
	    
	    if (forward.compareTo(direction) == 0) {
	    	go(1);
	    }
	    
	    if (backward.compareTo(direction) == 0) {
	    	go(-1);
	    }
	    
	    if (stop.compareTo(direction) == 0) {
	    	go(0);
	    }
		
	}
	
	private void go(int s) {
		m_fL.setSpeed(s);
		m_fR.setSpeed(s);
		m_rL.setSpeed(s);
		m_rR.setSpeed(s);
		
	}
	

}
