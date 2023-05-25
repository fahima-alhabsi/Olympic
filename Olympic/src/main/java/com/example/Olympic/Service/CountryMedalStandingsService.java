package com.example.Olympic.Service;


import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Models.CountryMedalStandings;
import com.example.Olympic.Repositry.CountryMedalStandingsRepositry;
import com.example.Olympic.ResponseObject.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryMedalStandingsService {
    @Autowired
    CountryMedalStandingsRepositry countryMedalStandingsRepositry;
    public void savecountry (CountryMedalStandings country){
        countryMedalStandingsRepositry.save(country);
    }
    public List<CountryMedalStandings> getcountry() {

        return countryMedalStandingsRepositry.findAll();
    }

    public GetCountryResponse getCountryAsString (CountryMedalStandings country) {
        GetCountryResponse CountryResponse = new GetCountryResponse(country.getCountryName(), country.getGoldMedals(),
                country.getSilverMedals(),country.getBronzeMedals());
        ;

        return CountryResponse;

    }
    public List<CountryMedalStandings> getcountryBycountryname(String countryName) {
        CountryMedalStandings examplecountry = new CountryMedalStandings();
        examplecountry.setCountryName(countryName);

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<CountryMedalStandings> example = Example.of(examplecountry, matcher);
        return countryMedalStandingsRepositry.findAll(example);
      //  return countryMedalStandingsRepositry.findAll(example);
    }
}
