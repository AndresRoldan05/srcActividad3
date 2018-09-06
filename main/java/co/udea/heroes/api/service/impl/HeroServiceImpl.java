package co.udea.heroes.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.udea.heroes.api.model.Hero;
import co.udea.heroes.api.service.HeroService;

@Service
public class HeroServiceImpl implements HeroService {

	@Override
	public List<Hero> getHeroes() {
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(new Hero(1, "Spider-man"));
		heroes.add(new Hero(1, "Hulk"));
		heroes.add(new Hero(1, "Ironman"));
		return heroes;}


}
