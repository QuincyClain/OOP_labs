package lab1.Specialities;

import lab1.Hero;
import lab1.SpecialitiesInterfaces.Assassin;

public class OrkAssassin extends Hero implements Assassin {
	public OrkAssassin(String name, int age) {
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
		System.out.print("I am Ork-Assassin");
	}
	public void invisibility() {
		if(isAlive) {
			noDamage = true;
			BaseDamage = 50;
			System.out.println("Герой " + Name + " использовал невидимость");
		}
	}
	public void knifeToss(Hero hero) {
		if(isAlive) {
			int knifeDamage = 50;
			hero.HP -= knifeDamage;
			Gold += knifeDamage;
			System.out.println(hero);
			isDead(hero);
		}
		else if(isAlive == false){
			publisher.aliveNotify(this);;
		}
	}
}
