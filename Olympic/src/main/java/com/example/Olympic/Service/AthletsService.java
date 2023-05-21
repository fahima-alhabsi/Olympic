package com.example.Olympic.Service;

import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Repositry.AthletesRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
