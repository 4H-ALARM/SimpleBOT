package SB;

public class DriveMotor {
	
	int m_speed = 0;
	String m_name = "";
	
	public DriveMotor() {
		
	}
	
	public DriveMotor(String name) {
		m_name = name;		
	}

	public void setSpeed(int s) {
		m_speed = s;
	}

}
