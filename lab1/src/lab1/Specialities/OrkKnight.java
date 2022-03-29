package lab1.Specialities;

import lab1.Hero;
import lab1.SpecialitiesInterfaces.Knight;

public class OrkKnight extends Hero implements Knight{
	public OrkKnight(String name, int age) {
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
		System.out.print("I am Ork-Knight");
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
		System.out.println("Щит поднят!");
		noDamage = true;
	}
}
