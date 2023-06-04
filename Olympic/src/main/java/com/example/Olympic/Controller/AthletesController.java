package com.example.Olympic.Controller;


import com.example.Olympic.Models.Athletes;
import com.example.Olympic.ResponseObject.GetAthletsResponse;
import com.example.Olympic.Service.AthletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("athletes")
@RestController

public class AthletesController {
    @Autowired
    AthletsService athletsService;

@RequestMapping ("create")
public void saveAthletes() {
     createAthlets();
}


@RequestMapping ("get")
    public List<Athletes> getAthletes(){
        return athletsService.getAthletes();
    }


    @RequestMapping("get/{athletesId}")
public GetAthletsResponse createAthlets (@PathVariable Long athletesId){
return athletsService.getAthletsById(athletesId);
    }
    private void createAthlets() {
        Athletes athletes = new Athletes();
        athletes.setNationality("omani");
        athletes.setName("fahima");
        athletes.setSport("football");
        athletsService.saveAthletes(athletes);
    }
    @RequestMapping(value = "get/{nationality}", method = RequestMethod.GET)
    public List<Athletes> getAthletes(@RequestParam(value = "nationality", required = false) String nationality ) {
        if (nationality != null) {

            return athletsService.getAthletesByNationality(nationality);
        } else {

            return athletsService.getAthletes();
        }
    }


    @RequestMapping(value = "search", method = RequestMethod.GET)
    public List<Athletes> searchAthletes(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "sport", required = false) String sport,
            @RequestParam(value = "country", required = false) String country) {

        return athletsService.searchAthletes(name, sport, country);
    }


    @RequestMapping(value = "getByNationality")
    public  Athletes getAthletesByNationalityByQuery(@RequestParam String nationality) {
        return athletsService.getAthletesByNationalityByQuery(nationality);
    }


}
