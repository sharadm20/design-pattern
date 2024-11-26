package command;

public class GarageDoorOpenCommand
implements Command {
	GarageDoor garageDoor;
	GarageDoorOpenCommand(GarageDoor door){
		this.garageDoor = door;
	}
	@Override
	public void execute() {
		garageDoor.up();
	}
	public void undo(){
		this.garageDoor.down();
	}

}

