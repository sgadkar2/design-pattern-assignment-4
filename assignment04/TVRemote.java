package assignment04;

public class TVRemote {
	private TV tv;

	public TVRemote(TV tvIn) {
		tv = tvIn;
		//TODO
		// make calls to tv.down() to set the TV channel to 2; notice that
		// this test driver raises the channel before connecting the remote.
		for(int i = tv.MAX_CHANNELS; i > 0; i--) 
			tv.down();
	}

	public void setChannel(int newChannel) {
		//TODO
		// write this method using multiple calls to tv.up() or
		// tv.down() as appropriate
		int curChannel = tv.getChannel();

		if(newChannel < curChannel){
			for(int i = curChannel; i > newChannel ; i--){
				tv.down();
			}
		}else if(newChannel > curChannel){
			for(int i = curChannel; i < newChannel; i++){
				tv.up();
			}
		}else{
			return;
		}
	}
}

