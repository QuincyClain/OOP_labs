package lab1;


import lab1.ObserverPattern.*;

public abstract class Hero implements Observer{
	public int BaseDamage = 10;
	public int Age;
	public String Name;
	public double HP = 20;
	public int Mana = 100;
	public double Gold = 0;
	public boolean noDamage = false;
	public boolean isAlive = true;
	protected Publisher publisher = new Publisher();
	
	public Hero(String name, int age) {
		Name = name;
		Age = age;
		publisher.addObserver(this);
	}
	public void roar() {
		System.out.print("I am Hero!");
	}
	public void attack(Hero hero) {
		if(isAlive) {
		if(hero.noDamage == true) {
			publisher.invincibleNotify(this, hero);
		}
		if(hero.noDamage == false) {
		hero.HP -= BaseDamage;
		Gold += BaseDamage;
		publisher.attackNotify(this, hero);
		isDead(hero);
		}
		noDamage = false;
		}
		else if(isAlive == false){
			publisher.aliveNotify(this);
		}	
	}
	protected boolean isDead(Hero hero) {
		if(hero.HP <= 0) {	
			hero.isAlive = false;
			hero.Gold = 0;
			String string = String.format(" герой %s был убит в бою!", hero.Name);
			publisher.deathNotify(string);
			//System.out.println("Герой " + hero.Name + " был убит в бою!");
		}
		return hero.isAlive;
	}
	
	public void update(String news) {
		String string = String.format("Игра уведомила %s, что", Name);
		System.out.println(string + news);
	}
	@Override
	public String toString() {
		return "Возраст" + "\t" + "Имя" + "\t" + "Здоровье" +"\t" + "Урон" + "\n" +
				Age + "\t" + Name + "\t" + Math.round(HP) + "\t\t" + BaseDamage + "\n";
	}
}
