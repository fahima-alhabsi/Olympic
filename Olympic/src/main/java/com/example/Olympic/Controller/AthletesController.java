package com.example.Olympic.Controller;


import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Service.AthletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
@RestController

public class AthletesController {
    @Autowired
    AthletsService athletsService;

@RequestMapping ("athletes/create")
public void saveAthletes(){
 createAthlets();


}

    private void createAthlets() {
        Athletes athletes = new Athletes();
        athletes.setNationality("omani");
        athletes.setName("fahima");
        athletes.setSport("football");
        athletsService.saveAthletes(athletes);
    }

}
