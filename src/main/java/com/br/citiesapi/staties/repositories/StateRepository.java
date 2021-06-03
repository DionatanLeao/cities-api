package com.br.citiesapi.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.citiesapi.staties.entities.State;

/***
 * 
 * @author dionatan
 *
 */

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
