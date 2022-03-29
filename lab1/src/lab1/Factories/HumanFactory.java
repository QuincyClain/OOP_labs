package lab1.Factories;

import java.util.ArrayList;


import lab1.Hero;

import lab1.Specialities.*;
import lab1.SpecialitiesInterfaces.*;

public class HumanFactory implements AbstractRaceFactory {
	private ArrayList<Hero> list = new ArrayList<Hero>();
	
	public Assassin createAssassin(String name, int age) {
		HumanAssassin obj = new HumanAssassin(name,age);
		list.add(obj);
		return obj;
	}
	public Knight createKnight(String name, int age) {
		HumanKnight obj = new HumanKnight(name,age);
		list.add(obj);
		return obj;
	}
	public Warrior createWarrior(String name, int age) {
		HumanWarrior obj = new HumanWarrior(name,age);
		list.add(obj);
		return obj;
	}
	public Necromant createNecromant(String name, int age) {
		HumanNecromant obj = new HumanNecromant(name, age);
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
