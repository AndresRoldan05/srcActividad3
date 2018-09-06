package co.udea.heroes.api.service;

import java.util.ArrayList;
import java.util.List;

import co.udea.heroes.api.model.Hero;

public class HeroService {
	
	public List<Hero> getService(){
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(new Hero(1, "Spider-man"));
		heroes.add(new Hero(1, "Hulk"));
		heroes.add(new Hero(1, "Ironman"));
		return heroes;}

}
