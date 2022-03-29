package lab1.Factories;

import java.util.ArrayList;


import lab1.Hero;
import lab1.Specialities.*;
import lab1.SpecialitiesInterfaces.*;

public class OrkFactory implements AbstractRaceFactory{
private ArrayList<Hero> list = new ArrayList<Hero>();
	
	public Assassin createAssassin(String name, int age) {
		OrkAssassin obj = new OrkAssassin(name,age);
		list.add(obj);
		return obj;
	}
	public Knight createKnight(String name, int age) {
		OrkKnight obj = new OrkKnight(name,age);
		list.add(obj);
		return obj;
	}
	public Warrior createWarrior(String name, int age) {
		OrkWarrior obj = new OrkWarrior(name,age);
		list.add(obj);
		return obj;
	}
	public Necromant createNecromant(String name, int age) {
		OrkNecromant obj = new OrkNecromant(name, age);
		list.add(obj);
		return obj;
	}
	
	public double reachedGold() {
		double gold = 0;
		for (Hero i: list) {
			gold += i.Gold;
		}
		return gold;
	}
}
