package lab1.Specialities;

import lab1.Hero;
import lab1.SpecialitiesInterfaces.Necromant;

public class OrkNecromant extends Hero implements Necromant{

	public OrkNecromant(String name, int age) {
		super(name,age);
		noDamage = false;
		if(age >= 150) {
			Age = 150;
		}
		BaseDamage = 30;
		HP = 150;
	}
	@Override
	public void roar() {
		System.out.print("I am Ork-Necromant");
	}
	public void soulCatch(Hero hero) {
		if(isAlive == true && hero.isAlive == true && hero.noDamage == false) {
			int healthDiff = 30;
			hero.HP -= healthDiff;
			HP += healthDiff;
			Gold += healthDiff;
			isDead(hero);
		}
		else {
			System.out.println("Герой или цель мертвы!");
		}
	}
	public void revive(Hero hero) {
		if(isAlive == true && hero.isAlive == false) {
			hero.isAlive = true;
			hero.HP = 50;
			hero.Gold = 0;
			System.out.println(Name + " Возродил персонажа " + hero.Name);
		}
		else if(isAlive == false) {
			System.out.println(Name + " Мертв, поэтому возрождение невозможно");
		}
		else if(hero.isAlive == true) {
			System.out.println("персонаж " + hero.Name + " уже жив!");
		}
	}
}
