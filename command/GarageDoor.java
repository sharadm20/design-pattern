package command;

public class GarageDoor {
	private String name;
	public GarageDoor(String string) {
		this.name = string;
    }
    public GarageDoor() {
	}
	public void down() {System.out.println(name + "Door is down");}
	public void stop() {System.out.println("stop");}
	public void up() {
		// TODO Auto-generated method stub
		System.out.println(name + "Door is up");
	}
	public void lightOn() {System.out.println("Garage lights are now on");}
	public void lightOff() {System.out.println("Garage lights are now off");}
}
