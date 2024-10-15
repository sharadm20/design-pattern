package singleton;

public class ChocolateBoilerBillPugh {
	private boolean empty;
	private boolean boiled;

	private ChocolateBoilerBillPugh() {
		empty = true;
		boiled = false;
	}

	private static class InstanceHelper {
		private static final ChocolateBoilerBillPugh INSTANCE = new ChocolateBoilerBillPugh();
	}
	
	public static ChocolateBoilerBillPugh getInstance() {
		
	return InstanceHelper.INSTANCE;
	}
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
	// fill the boiler with a milk/chocolate mixture
		}
	}
	// rest of ChocolateBoiler code...
		public void drain() {
			if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
				empty = true;
			}
		}
		public void boil() {
			if (!isEmpty() && !isBoiled()) {
				// bring the contents to a boil
				boiled = true;
			}
		}
		public boolean isEmpty() {
			return empty;
		}
		public boolean isBoiled() {
			return boiled;
		}	

}
