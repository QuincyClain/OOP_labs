package lab1.DecoratorPattern;

import lab1.Hero;
import lab1.ObserverPattern.Publisher;

public interface Amplification {
	Publisher publisher = new Publisher();
	float multiplier=1.1f;
	void buff(Hero hero);
	
	//другие методы
}
