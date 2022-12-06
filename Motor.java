package SB;

public class Motor {
	
	int m_speed = 0;
	String m_name = "";
	
	public Motor() {
		
	}
	
	public Motor(String name) {
		m_name = name;		
	}

	public void setSpeed(int s) {
		m_speed = s;
	}

}
