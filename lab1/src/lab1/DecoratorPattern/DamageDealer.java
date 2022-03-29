package lab1.DecoratorPattern;

import lab1.Specialities.*;
import lab1.Hero;

public class DamageDealer extends BaseDecorator{
	
	public DamageDealer(Amplification rank) {
		super(rank);
	}
	public DamageDealer(Hero hero) {
		super(hero);
		System.out.println(hero.Name + " теперь DamageDealer!");
	}
	public DamageDealer() {
		
	}
	
	private Hero giveWeapon(Hero hero) {
		System.out.println(hero.Name+ " получил оружие! ");
		if(hero instanceof HumanAssassin || hero instanceof OrkAssassin) {
			hero.BaseDamage +=20;
		}
		else if(hero instanceof HumanNecromant || hero instanceof OrkNecromant) {
			hero.BaseDamage +=5;
			hero.Mana = 100;
			System.out.println(hero.Name + " полностью восстановил ману");
		}
		else hero.BaseDamage += 10;
		return hero;
	}
	
	@Override
	public void buff(Hero hero) {
		if(hero.isAlive) {
			
			super.buff(giveWeapon(hero));
		}
		else System.out.println("Дождитесь воскрешения этого героя!");
	}
	
	
}
