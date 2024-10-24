package command;

public class RemoteControl {
	private Command[] onCommand;
	private Command[] offCommand;
	public RemoteControl() {
		this.onCommand = new Command[7];
		this.offCommand = new Command[7];
		Command noty = new NoCommand();
		for(int i=0; i<7; i++) {
			this.onCommand[i] = noty;
			this.offCommand[i] = noty;
		}
	}
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommand[slot] = onCommand;
		this.offCommand[slot] = offCommand;
	}
	public void onButtonWasPressed(int slot) {
		this.onCommand[slot].execute();
	}
	public void offButtonWasPressed(int slot) {
		this.offCommand[slot].execute();
	}
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommand.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommand[i].getClass().getName()
					+ " " + offCommand[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
