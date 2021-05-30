package com.br.citiesapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.citiesapi.countries.entities.Country;
import com.br.citiesapi.countries.repository.CountryRepository;

/***
 * 
 * @author dionatan
 *
 */

@RestController
@RequestMapping("/countries")
public class CountryResource {
	
	@Autowired
	private CountryRepository repository;
	
	@GetMapping
	public List<Country> countries() {
		return repository.findAll();
	}
	 
}
