package lab1.Specialities;

import lab1.ObserverPattern.*;


import lab1.Hero;
import lab1.SpecialitiesInterfaces.*;

public class HumanAssassin extends Hero implements Assassin, Observer{
	
	public HumanAssassin(String name, int age) {
		super(name,age);
		if(age >=100) {
			Age = 100;
		}
		BaseDamage = 25;
		HP=100;
	}
	
	@Override
	public void roar() {
		System.out.print("I am Human-Assassin");
	}

	public void invisibility() {
	if(isAlive) {
		noDamage = true;
		BaseDamage = 50;
		System.out.println("Герой " + Name + " использовал невидимость");
	}
	else if(isAlive == false) {
		publisher.aliveNotify(this);
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
