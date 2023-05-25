package com.example.Olympic.Controller;

import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Models.CountryMedalStandings;
import com.example.Olympic.ResponseObject.GetAthletsResponse;
import com.example.Olympic.ResponseObject.GetCountryResponse;
import com.example.Olympic.Service.CountryMedalStandingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "country/get/{country}", method = RequestMethod.GET)
    public List<CountryMedalStandings> getAthletes(@RequestParam(value = "country", required = false) String country ) {
        if (country != null) {

            return countryMedalStandingsService.getcountryBycountryname(country);
        } else {

            return countryMedalStandingsService.getcountry();
        }
    }

}
