package command;

public class LightOnCommand implements Command {
	Light light;
	public LightOnCommand(Light light) {
		this.light= light;
		}

	@Override
	public void execute() {
	
		this.light.on();
	}
	public void undo(){
		this.light.off();
	}

}
