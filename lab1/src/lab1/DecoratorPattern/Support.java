package lab1.DecoratorPattern;

import lab1.Hero;

public class Support extends BaseDecorator{
	public Support(Amplification rank) {
		super(rank);
	}
	public Support(Hero hero) {
		super(hero);
	}
	public Support() {
		
	}
	private Hero giveHeal(Hero hero) {
		float Health = 0f;
		if(hero.HP < 100) {
			Health = 50;
			hero.HP += Health;
		}
		else if(hero.HP >=100) {
			Health = 20;
			hero.HP += Health;
			hero.Age -= 10;
		}
		System.out.println(hero.Name + " был исцелен на " + Math.round(Health) + " здоровья");
		return hero;
	}
	@Override
	public void buff(Hero hero) {
		if(hero.isAlive) {
			super.buff(giveHeal(hero));
		}
		else System.out.println("Дождитесь воскрешения этого героя!");
		// + method
	}
}
