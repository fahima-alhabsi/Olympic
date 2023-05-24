package com.example.Olympic.Controller;


import com.example.Olympic.Models.Athletes;
import com.example.Olympic.ResponseObject.GetAthletsResponse;
import com.example.Olympic.Service.AthletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AthletesController {
    @Autowired
    AthletsService athletsService;

@RequestMapping ("athletes/create")
public void saveAthletes() {
     createAthlets();
}


@RequestMapping ("athletes/get")
    public List<Athletes> getAthletes(){
        return athletsService.getAthletes();
    }


    @RequestMapping("athletes/get/{athletesId}")
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

    @RequestMapping(value = "Athletes/get", method = RequestMethod.GET)
    public List<Athletes> getAthletes(@RequestParam(value = "nationality", required = false) String nationality ) {
        if (nationality != null) {

            return athletsService.getAthletesByNationality(nationality);
        } else {

            return athletsService.getAthletes();
        }
    }






}
