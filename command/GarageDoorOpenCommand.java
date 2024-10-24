package command;

public class GarageDoorOpenCommand
implements Command {
	GarageDoor door;
	GarageDoorOpenCommand(GarageDoor door){
		this.door = door;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.up();
	}

}

