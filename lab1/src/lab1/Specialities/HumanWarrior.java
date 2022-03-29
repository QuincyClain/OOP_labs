package lab1.Specialities;
import lab1.Hero;
import lab1.SpecialitiesInterfaces.Warrior;

public class HumanWarrior extends Hero implements Warrior{

	public HumanWarrior(String name, int age) {
		super(name, age);
		if(age >= 100) {
			Age = 100;
		}
		BaseDamage = 35;
		HP=120;
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
