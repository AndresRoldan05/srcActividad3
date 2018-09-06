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
	
	@RequestMapping("Listar")
	public List<Hero> getHeroes(){
		
		return heroservice.getHeroes();}

}
