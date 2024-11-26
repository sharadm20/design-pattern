package command;

public class GarageDoorUpCommand implements Command{
    private GarageDoor garageDoor;
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
      this.garageDoor.up();
    }
    public void undo(){
      this.garageDoor.down();
    }
}
