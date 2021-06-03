package com.br.citiesapi.staties.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.citiesapi.staties.entities.State;
import com.br.citiesapi.staties.repositories.StateRepository;

/***
 * 
 * @author dionatan
 *
 */

@RestController
@RequestMapping("/staties")
public class StateResource {

	@Autowired
	private StateRepository repository;

	@GetMapping
	public List<State> staties() {
		return repository.findAll();
	}

}
