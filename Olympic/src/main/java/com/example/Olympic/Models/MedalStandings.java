




package com.example.Olympic.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Data
public class MedalStandings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
