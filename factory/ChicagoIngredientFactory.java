package factory;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
	
		public Dough createDough() {
		return new ThinCrustDough();
		}
		public Sauce createSauce() {
		return new PlumTomatoSauce();
		}
		public Cheese createCheese() {
		return new MozzarellaCheese();
		}
		public Veggies[] createVeggies() {
		Veggies veggies[] = { new Spinach(), new EggPlant(), new BlackOlives() };
		return veggies;
		}
		public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
		}
		public Clams createClam() {
		return new FrozenClams();
		}
}
