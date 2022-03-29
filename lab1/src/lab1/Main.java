package lab1;
import lab1.Factories.*;

import lab1.ObserverPattern.Publisher;
import lab1.Specialities.*;
import lab1.DecoratorPattern.*;

public class Main {

	public static void main(String[] args) {
		//Observer
		Publisher publisher = new Publisher();
		//Race factories
		AbstractRaceFactory fact1;
		AbstractRaceFactory fact2;
		fact1 = new HumanFactory();
		fact2 = new OrkFactory();
		//Race creators
		Hero hero = (HumanAssassin)fact1.createAssassin("Vlad", 30);
		Hero hero2 = (HumanAssassin)fact1.createAssassin("Alex", 40);
		Hero hero3 = (OrkAssassin)fact2.createAssassin("Rexar", 45);
		Hero hero4 = (HumanKnight)fact1.createKnight("Knight", 35);
		Hero hero5 = (HumanNecromant)fact1.createNecromant("Guldan", 100);
		
		//Army
		//objects print info
		System.out.println(hero.getClass());
		System.out.println(hero);
		System.out.println(hero2.getClass());
		System.out.println(hero2);
		System.out.println(hero3.getClass());
		System.out.println(hero3);
		//Abilities
		((HumanAssassin)hero).invisibility();
		((HumanAssassin)hero2).attack(hero);
		((HumanAssassin)hero).attack(hero2);
		((HumanAssassin)hero).knifeToss(hero2);
		((HumanAssassin)hero2).attack(hero);
		((OrkAssassin)hero3).attack(hero);
		((HumanKnight)hero4).shieldBlock();
		((OrkAssassin)hero3).attack(hero4);
		((HumanKnight)hero4).swordAttack(hero3);
		System.out.println(hero3);
		((OrkAssassin)hero3).attack(hero4);
		((HumanNecromant)hero5).revive(hero2);
		((HumanAssassin)hero2).attack(hero4);
		System.out.println(hero2);
		((HumanNecromant)hero5).soulCatch(hero2);
		((HumanNecromant)hero5).soulCatch(hero2);
		System.out.println(hero5);
		((HumanAssassin)hero2).knifeToss(hero5);
		
		
		//check reachedGold
		System.out.println("Золото людей: " +fact1.reachedGold());
		System.out.println("Золото орков: " +fact2.reachedGold());	
		System.out.println("\n");
		
		//check observers
		publisher.getObservers();
		
		//Decorator pattern
		System.out.println(hero);
		BaseDecorator damager = new DamageDealer(hero);
		BaseDecorator healer = new Support(hero);
		BaseDecorator reviver = new Reviver(hero);
		
		BaseDecorator dhr = new Reviver(new Support(new DamageDealer(hero)));
		damager.buff(hero5);
		healer.buff(hero5);
		reviver.buff(hero5);
		dhr.buff(hero5);
		

		
	}

}
