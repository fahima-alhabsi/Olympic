package com.example.Olympic.Controller;

import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Models.CountryMedalStandings;
import com.example.Olympic.Service.CountryMedalStandingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryMedalStandingsController {

    @Autowired
    CountryMedalStandingsService countryMedalStandingsService;
    @RequestMapping ("country/create")
    public void savecountry() {
        createCountry();
    }

    private void createCountry() {
        CountryMedalStandings country = new CountryMedalStandings();
        country.setCountryName("oman");
        country.setGoldMedals(3);
        country.setSilverMedals(1);
        country.setBronzeMedals(2);

        countryMedalStandingsService.savecountry(country);
    }
    @RequestMapping ("country/get")
    public List< CountryMedalStandings> getcountry(){
        return countryMedalStandingsService.getcountry();
    }


}
