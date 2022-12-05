package SB;

public class DriveTrain {
	
	Motor m_fL;
	Motor m_fR;
	Motor m_rL;
	Motor m_rR;
	
	Sensor m_hitFrontWall;
	Sensor m_hitBackWall;
	
	public DriveTrain() {
		m_fL = new Motor("frontLeft");
		m_fR = new Motor("frontRight");
		m_rL= new Motor("rearLeft");
		m_rR= new Motor("rearRight");
		
		m_hitFrontWall = new Sensor();
		m_hitBackWall = new Sensor();
	}
	
	public void drive(String direction) {
		String stop = "s";
	    String forward = "f";
	    String backward = "b";
	    
	    if (forward.compareTo(direction) == 0) {
	    	if (m_hitFrontWall.read()) {
	    		go(0);
	    	} else {
	    		go(1);
	    	}	    	
	    }
	    
	    if (backward.compareTo(direction) == 0) {
	    	if (m_hitBackWall.read()) {
	    		go(0);
	    	} else {
	    		go(-1);
	    	}
	    }
	    
	    if (stop.compareTo(direction) == 0) {
	    	go(0);
	    }	
	}
	
	public void updateSensors() {
		m_hitFrontWall.update();
		m_hitBackWall.update();
	}
	
	private void go(int s) {
		m_fL.setSpeed(s);
		m_fR.setSpeed(s);
		m_rL.setSpeed(s);
		m_rR.setSpeed(s);
		
	}
	

}
