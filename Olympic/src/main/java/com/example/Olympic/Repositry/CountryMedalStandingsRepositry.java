package com.example.Olympic.Repositry;

import com.example.Olympic.Models.CountryMedalStandings;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryMedalStandingsRepositry extends JpaRepository<CountryMedalStandings, Long> {
}
