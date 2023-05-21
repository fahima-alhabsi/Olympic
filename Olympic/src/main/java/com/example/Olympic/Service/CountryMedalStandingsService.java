package com.example.Olympic.Service;

import com.example.Olympic.Repositry.CountryMedalStandingsRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryMedalStandingsService {
    @Autowired
    CountryMedalStandingsRepositry countryMedalStandingsRepositry;
}
