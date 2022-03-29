package lab1.Factories;
import lab1.SpecialitiesInterfaces.*;

public interface AbstractRaceFactory{
	Assassin createAssassin(String name, int age);
	Knight createKnight(String name, int age);
	Warrior createWarrior(String name, int age);
	Necromant createNecromant(String name, int age);
	double reachedGold();
}
