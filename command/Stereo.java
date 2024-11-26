package command;

public class Stereo {
	private int volume;
	private String name;
	public Stereo(String string) {
        //TODO Auto-generated constructor stub
		this.name = string;
    }
    public void on() {
		System.out.println(name +" Stereo on");
	}
	public void off(){
		System.out.println(name+" Stereo off");
	}
	public void setCD(){}
	public void setDvd(){}
	public void setRadio(){}
	public void setVolume(int vol){
		this.volume = vol; 
	}
}
