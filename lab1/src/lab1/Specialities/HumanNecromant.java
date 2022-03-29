package lab1.Specialities;
import lab1.Hero;
import lab1.SpecialitiesInterfaces.Necromant;

public class HumanNecromant extends Hero implements Necromant{

	public HumanNecromant(String name, int age) {
		super(name, age);
		if(age >= 100) {
			Age = 100;
		}
		BaseDamage = 20;
		HP=110;
	}
	@Override
	public void roar() {
		System.out.println("I am Human-Necromant");
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

}
