
package lab1.ObserverPattern;

import lab1.Hero;

public class Publisher implements AbstractPublisher{
	

	
	private String newsHero;
	
	public void buffNotify(Hero hero) {
		String news = String.format(" " +hero.Name + " был усилен ");
		this.newsHero = news;
		notifyObservers();
	}
	
	public void deathNotify(String news) {	
		this.newsHero = news;
		notifyObservers();
	}
	
	public void attackNotify(Hero hero1, Hero hero2) {
		String news = String.format(" герой %s был атакован на %2d HP", hero2.Name, hero1.BaseDamage);
		this.newsHero = news;
		hero1.update(news);
		hero2.update(news);
	}
	
	public void invincibleNotify(Hero hero1, Hero hero2) {
		String news = String.format(" герой %s неуязвим!", hero2.Name);
		this.newsHero = news;
		hero1.update(news);
	}
	
	public void aliveNotify(Hero hero) {
		String string = " его герой был убит, поэтому не может атаковать";
		hero.update(string);
	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	public void getObservers() {
		for(Observer o: observers) {
			System.out.println(o);
		}
	}
	public void notifyObservers() {
		for(Observer var: observers) {
			var.update(newsHero);
		}
	}
	
	
}	
