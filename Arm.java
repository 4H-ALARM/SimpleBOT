package SB;


public class Arm {
	
	private Motor m_pitchM;
	private Motor m_yawM;
	
	private Sensor m_pitchS;
	private Sensor m_yawS;
	
	private YawSM m_yawState;
	
	public Arm() {
		m_pitchM = new Motor("pitch");
		m_yawM = new Motor("yaw");
		m_pitchS = new Sensor();
		m_yawS = new Sensor();
		m_yawState = YawSM.Stopped;
	}
	
	public void move(String direction) {		
		// move in commanded direction
		if (Commands.up.compareTo(direction) == 0) {
			pitch(1);
		}
		
		if (Commands.down.compareTo(direction) == 0) {
			pitch(-1);
		}
		
		if (Commands.left.compareTo(direction) == 0) {
			yaw(-1);
			m_yawState.nextState(-1, m_yawS.read(), !m_yawS.read());
		}
		
		if (Commands.right.compareTo(direction) == 0) {
			yaw(1);
			m_yawState.nextState(1, !m_yawS.read(), m_yawS.read());
		}
		
		if (Commands.stop.compareTo(direction) == 0) {
			stop();
			m_yawState.nextState(0, m_yawS.read(), m_yawS.read());
		}
		
	}
	
	public void stop() {		
		m_pitchM.setSpeed(0);
		m_yawM.setSpeed(0);		
	}

	public void updateSensor() {
		m_pitchS.update();
		m_yawS.update();
	}
	
	private void pitch(int s) {
		// if we have reached limit stop
		if (m_pitchS.read()) {
			m_pitchM.setSpeed(0);
		} else {
			m_pitchM.setSpeed(s);
		}		
	}
	
	private void yaw(int s) {
		// if we have reached limit stop
		if (m_yawS.read()) {
			m_yawM.setSpeed(0);
		} else {
			m_yawM.setSpeed(s);
		}		
	}
}
