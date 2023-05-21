package com.example.Olympic.Service;

import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Repositry.AthletesRepositry;
import com.example.Olympic.ResponseObject.GetAthletsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AthletsService {

    @Autowired
    AthletesRepositry athletesRepositry;
public void saveAthletes (Athletes athetes){
    athletesRepositry.save(athetes);
}
    public List<Athletes> getAthletes() {

    return athletesRepositry.findAll();
    }

public GetAthletsResponse getAthletsById (long Athletesid){

    Optional<Athletes> optionalAthletes =  athletesRepositry.findById(Athletesid);
    if(!optionalAthletes.isEmpty())
    {
        Athletes athletes =  optionalAthletes.get();
        GetAthletsResponse AthletesResponse = new GetAthletsResponse(
        athletes.getName(), athletes.getNationality(), athletes.getSport());

        return AthletesResponse;
    }

    return null;



}




}
