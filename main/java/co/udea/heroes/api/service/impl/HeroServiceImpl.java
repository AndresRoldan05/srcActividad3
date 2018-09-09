package co.udea.heroes.api.service.impl;

import java.util.ArrayList;
import java.util.List;

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
	public List<Hero> getHeroes() {
		
		return heroRepository.findAll();}


}
