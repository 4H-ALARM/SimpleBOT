package SB;

public enum YawSM {
	Stopped {
        @Override
        public YawSM nextState(int speed, boolean atLeftLimit, boolean atRightLimit) {
        	if (speed == 0) {
        		return Stopped;
        	} else {
        		if (speed < 0) {
        			if (atLeftLimit) {
        				return Stopped;
        			} else {
            			return MovingLeft;
        			}
        		} else {
        			if (atRightLimit) {
        				return Stopped;
        			} else {
        				return MovingRight;
        			}
        		}
        	}
        }
    },
    MovingRight {
        @Override
        public YawSM nextState(int speed, boolean atLeftLimit, boolean atRightLimit) {
        	if (speed == 0) {
        		return Stopped;
        	} else {
        		if (speed < 0) {
        			if (atLeftLimit) {
        				return Stopped;
        			} else {
            			return MovingLeft;
        			}
        		} else {
        			if (atRightLimit) {
        				return Stopped;
        			} else {
        				return MovingRight;
        			}
        		}
        	}
        }
    },
    MovingLeft {
        @Override
        public YawSM nextState(int speed, boolean atLeftLimit, boolean atRightLimit) {
        	if (speed == 0) {
        		return Stopped;
        	} else {
        		if (speed < 0) {
        			if (atLeftLimit) {
        				return Stopped;
        			} else {
            			return MovingLeft;
        			}
        		} else {
        			if (atRightLimit) {
        				return Stopped;
        			} else {
        				return MovingRight;
        			}
        		}
        	}
        }
    };
	
    public abstract YawSM nextState(int speed, boolean atLeftLimit, boolean atRightLimit);

}
