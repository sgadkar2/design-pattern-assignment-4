package assignment04;

public class ThermostatRemote {
	private Thermostat stat;
	public ThermostatRemote(Thermostat statIn) {
		stat = statIn;
		//TODO
		// make calls to stat.cooler() to set the temperature to the minimum
		// notice the test driver raises the temp before connecting the remote.
		for(int i = stat.MAX_TEMPERATURE; i > stat.MIN_TEMPERATURE; i--) 
			stat.cooler();
	}

	public void setTemperature(int newTemp){
		//TODO
		// write this method using multiple calls to stat.warmer() or
		// stat.cooler() as appropriate

		int curTemp = stat.getTemperature();

		if(newTemp < curTemp){
			for(int i = curTemp; i > newTemp ; i--){
				stat.cooler();
			}
		}else if(newTemp > curTemp){
			for(int i = curTemp; i < newTemp; i++){
				stat.warmer();
			}
		}else{
			return;
		}

	}
}

