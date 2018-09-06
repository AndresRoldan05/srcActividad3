package co.udea.heroes.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.heroes.api.model.Hero;
import co.udea.heroes.api.service.HeroService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tourofheroes")

public class HeroController {
	
	private HeroService heroservice = new HeroService();
	
	@RequestMapping("Listar")
	public List<Hero> getHeroes(){
		
		return heroservice.getService();}

}
