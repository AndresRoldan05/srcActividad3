package co.udea.heroes.api.service;

import java.util.ArrayList;
import java.util.List;

import co.udea.heroes.api.model.Hero;

public interface HeroService {
	
	public  List<Hero> getHeroes();
	
	public Hero getHero(int id);
	
	public Hero searchHeroes(String term);
	//public Hero getHeroNo404<Data>(int number);
	public Hero updateHero(Hero hero);
	public Hero addHero(Hero hero);
	public void deleteHero(Hero hero);
	

}
