package lab1.DecoratorPattern;

import lab1.Hero;
import lab1.Specialities.*;

public class Reviver extends BaseDecorator{
	public Reviver(Amplification rank) {
		super(rank);
	}
	public Reviver(Hero hero) {
		super(hero);
	}
	public Reviver() {
		
	}
	private Hero revive(Hero hero) {
		if(hero.isAlive == false) {
			if(hero instanceof HumanAssassin || hero instanceof OrkAssassin) {
				hero.isAlive = true;
				hero.HP = 50;
				hero.Gold = 0;
				hero.Mana = 50;
			}
			else if(hero instanceof HumanNecromant || hero instanceof OrkNecromant) {
				hero.isAlive = true;
				hero.HP = 50;
				hero.Gold = 0;
				hero.Mana = 100;
			}
			System.out.println(hero.Name + " был воскрешен");
		}
		else if(hero.isAlive == true) {
			System.out.println("герой " + hero.Name + " не нуждается в воскрешении");
		}
		return hero;
	}
	@Override
	public void buff(Hero hero) {
		super.buff(revive(hero));
		// + method
	}
}
