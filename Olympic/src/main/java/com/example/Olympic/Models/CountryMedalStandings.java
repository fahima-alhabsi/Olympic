




package com.example.Olympic.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Data

public class CountryMedalStandings {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String countryName;
    private int goldMedals;
    private int silverMedals;
    private int bronzeMedals;



}
