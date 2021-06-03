package com.br.citiesapi.countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.citiesapi.countries.entities.Country;

/***
 * 
 * @author dionatan
 *
 */

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
