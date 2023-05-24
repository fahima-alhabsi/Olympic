package com.example.Olympic.Service;


import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Models.CountryMedalStandings;
import com.example.Olympic.Repositry.CountryMedalStandingsRepositry;
import com.example.Olympic.ResponseObject.GetAthletsResponse;
import com.example.Olympic.ResponseObject.GetCountyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryMedalStandingsService {
    @Autowired
    CountryMedalStandingsRepositry CountryMedalStandingsRepositry;
    public void savecountry (CountryMedalStandings country){
        CountryMedalStandingsRepositry.save(country);
    }
    public List<CountryMedalStandings> getcountry() {

        return CountryMedalStandingsRepositry.findAll();
    }

    public GetCountyResponse getCountryAsString (CountryMedalStandings country) {
        GetCountyResponse CountryResponse = new GetCountyResponse(country.getCountryName(), country.getGoldMedals(),
                country.getSilverMedals(),country.getBronzeMedals());
        ;

        return CountryResponse;

    }
    public List<CountryMedalStandings> getCountryByCountryname(String country) {
        CountryMedalStandings examplecountry = new CountryMedalStandings();
        examplecountry.setCountryName(country);

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<CountryMedalStandings> example = Example.of(examplecountry, matcher);

        return CountryMedalStandingsRepositry.findAll(example);
    }
}
