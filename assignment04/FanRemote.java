package assignment04;

public class FanRemote {
	private Fan fan;
	public FanRemote(Fan fanIn) {
		fan = fanIn;
		//TODO
		for(int i = fan.MAX_SPEED; i > 0 ; i--){
			fan.slower();
		}
		// make calls to fan.slower() to set the fan speed to 0; notice that
		// the test driver sets the fan to maximum before connecting the remote.
	}

	public void setSpeed(int newSpeed) {
		//TODO
		// write this method using multiple calls to fan.faster() or
		// fan.slower() as appropriate
		int curSpeed = fan.getSpeed();

		if(newSpeed < curSpeed){
			for(int i = curSpeed; i > newSpeed ; i--){
				fan.slower();
			}
		}else if(newSpeed > curSpeed){
			for(int i = curSpeed; i < newSpeed; i++){
				fan.faster();
			}
		}else{
			return;
		}

	}

}

