package lab1.Specialities;

import lab1.Hero;
import lab1.SpecialitiesInterfaces.*;

public class HumanKnight extends Hero implements Knight{

	public HumanKnight(String name, int age) {
		super(name, age);
		if(age >= 100) {
			Age = 100;
		}
		BaseDamage = 30;
		HP=120;
	}
	@Override
	public void roar() {
		System.out.println("I am Human-Knight");
	}
	public void swordAttack(Hero obj) {
		if(obj.noDamage == false && obj.isAlive == true && isAlive == true ) {
			obj.HP -= BaseDamage *1.25;
			System.out.println("Герой " + obj.Name + " был атакован мечом на " + BaseDamage*1.25+" HP" );
			noDamage = false;
			Gold+=BaseDamage*1.25;
			isDead(obj);
		}
		else if(obj.noDamage == true) {
			System.out.println("Объект " + obj.Name + " неуязвим");
		}
		else if(obj.isAlive == false) {
			System.out.println("Объект уже убит");
		}
		else if(isAlive == false) {
			System.out.println("Герой " + Name + " мертв, поэтому не может аттаковать");
		}
	}
	
	public void shieldBlock() {
		if(isAlive) {
		System.out.println("Щит поднят!");
		noDamage = true;
		}
		else {
			System.out.print("невозможно.");
		}
	}
}
