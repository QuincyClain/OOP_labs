package lab1.DecoratorPattern;

import lab1.Hero;

public class AmplificationController implements Amplification{
	//базовая реализация методов интерфейса
	public void buff(Hero hero) {
		if(hero.isAlive == true) {
			hero.HP *= multiplier;
			hero.BaseDamage *= multiplier;
			publisher.buffNotify(hero);
		}
		else System.out.println("Убитый герой не может быть усилен");
	}
}
