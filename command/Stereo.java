package command;

public class Stereo {
	private int volume;
	public void on() {
		System.out.println("Stereo on");
	}
	public void off(){
		System.out.println("Stereo off");
	}
	public void setCD(){}
	public void setDvd(){}
	public void setRadio(){}
	public void setVolume(int vol){
		this.volume = vol; 
	}
}
