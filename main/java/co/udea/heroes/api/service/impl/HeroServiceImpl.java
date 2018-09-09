package co.udea.heroes.api.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.udea.heroes.api.model.Hero;
import co.udea.heroes.api.repository.HeroRepository;
import co.udea.heroes.api.service.HeroService;

@Service
public class HeroServiceImpl implements HeroService {

	private HeroRepository heroRepository;
	
	public HeroServiceImpl(HeroRepository heroRepository) {
		this.heroRepository=heroRepository;
	}
	
	@Override   
	public List<Hero> getHeroes() {//GET
		
		return heroRepository.findAll();}
	
	@Override
	public Hero getHero(int id) {//GET
		Optional<Hero> hero = heroRepository.findById(String.valueOf(id));
		return hero.get();
	}
	
	
	
	@Override
	public Hero searchHeroes(String term) {//GET
		Optional<Hero> hero = heroRepository.findById(term);		
		return hero.get();}
	
	@Override
	public Hero updateHero(Hero hero) {//PUT
		return heroRepository.saveAndFlush(hero);
		}
	@Override
	public Hero addHero(Hero hero) {//PUT		
		return heroRepository.saveAndFlush(hero);}
	
	@Override
	public void deleteHero(Hero hero) {//DELETE
		heroRepository.delete(hero);
		}




}
