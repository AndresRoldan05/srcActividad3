package co.udea.heroes.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.heroes.api.model.Hero;

public interface HeroRepository extends JpaRepository <Hero, String> {
	
	
}
 