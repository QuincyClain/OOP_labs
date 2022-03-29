package lab1.Specialities;

import lab1.Hero;
import lab1.SpecialitiesInterfaces.Warrior;

public class OrkWarrior extends Hero implements Warrior{

	public OrkWarrior(String name, int age) {
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
		System.out.print("I am Ork-Warrior");
	}
	public void rage() {
		if(isAlive) {
			//some logic
		}
		else {
			System.out.println("герой мертв!");
		}
	}
}
