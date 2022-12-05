package SB;

public class Sensor {
	
	boolean m_atLimit = false;
	
	public Sensor() {
		
	}
	
	public boolean read() {
		return(m_atLimit);
	}
	
	public void update() {
		m_atLimit = !m_atLimit;
	}
	
	

}
