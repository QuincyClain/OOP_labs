package lab1.DecoratorPattern;

import lab1.Hero;

public abstract class BaseDecorator implements Amplification{
	Amplification amplify = new AmplificationController();
	public Hero hero;
	
	public BaseDecorator(Hero hero) {
		this.hero = hero;
	}
	
	public BaseDecorator(Amplification rank) {
		this.amplify=rank;
	}
	
	public BaseDecorator() {}
	@Override
	public void buff(Hero hero) {
		amplify.buff(hero);
	}
}
