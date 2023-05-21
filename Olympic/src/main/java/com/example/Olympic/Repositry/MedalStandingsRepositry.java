package com.example.Olympic.Repositry;

import com.example.Olympic.Models.MedalStandings;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;


public interface MedalStandingsRepositry extends JpaRepository<MedalStandings, Long> {
}
