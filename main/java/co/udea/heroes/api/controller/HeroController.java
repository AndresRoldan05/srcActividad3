package co.udea.heroes.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.heroes.api.model.Hero;
import co.udea.heroes.api.service.HeroService;
import co.udea.heroes.api.service.impl.HeroServiceImpl;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tourofheroes")

public class HeroController {
	
	@Autowired
	private HeroService heroservice;
	
	@RequestMapping("listar")
	public List<Hero> getHeroes(){//GET
		
		return heroservice.getHeroes();}
	
	@RequestMapping("consultar")
	public Hero getHero(int id) {//GET
		// Hero hero = heroservice.findById(id);
		return heroservice.getHero(id);
		//return null;	
		}
	
	@RequestMapping("buscar")	//GET
	public Hero searchHeroes(String term) {return heroservice.searchHeroes(term);}
	
	@RequestMapping("actualizar")  //PUT
	public Hero updateHero(Hero hero) {return heroservice.updateHero(hero);}
	
	@RequestMapping("crear") //PUT
	public Hero addHero(Hero hero) {return heroservice.addHero(hero);}
	
	@RequestMapping("borrar")  //DELETE
	public void deleteHero(Hero hero) {heroservice.deleteHero(hero);}

}
