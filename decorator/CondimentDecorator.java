package decorator;
//extend beverage for type only, as using composition over inheritance so we have a Beverage as property.
public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}