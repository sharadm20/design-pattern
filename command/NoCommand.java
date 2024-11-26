package command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// does nothin
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'undo'");
	}

}
