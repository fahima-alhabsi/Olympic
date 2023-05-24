package com.example.Olympic.Controller;

import com.example.Olympic.Service.CountryMedalStandingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryMedalStandingsController {

    @Autowired
    CountryMedalStandingsService countryMedalStandingsService;
}
