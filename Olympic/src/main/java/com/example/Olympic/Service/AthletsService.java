package com.example.Olympic.Service;

import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Repositry.AthletesRepositry;
import com.example.Olympic.ResponseObject.GetAthletsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AthletsService {

    @Autowired
    AthletesRepositry athletesRepositry;

    public void saveAthletes(Athletes athetes) {
        athletesRepositry.save(athetes);
    }

    public List<Athletes> getAthletes() {

        return athletesRepositry.findAll();
    }

    public GetAthletsResponse getAthletsById(long Athletesid) {

        Optional<Athletes> optionalAthletes = athletesRepositry.findById(Athletesid);
        if (!optionalAthletes.isEmpty()) {
            Athletes athletes = optionalAthletes.get();
            GetAthletsResponse AthletesResponse = new GetAthletsResponse(
                    athletes.getName(), athletes.getNationality(), athletes.getSport());

            return AthletesResponse;
        }

        return null;


    }

    public List<Athletes> getAthletesByNationality(String Nationality) {
        Athletes exampleAthletes = new Athletes();
        exampleAthletes.setNationality(Nationality);

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Athletes> example = Example.of(exampleAthletes, matcher);

        return athletesRepositry.findAll(example);
    }

    public GetAthletsResponse getAthletAsString(Athletes a) {
        GetAthletsResponse AthletsResponse = new GetAthletsResponse(a.getName(), a.getNationality(), a.getSport()
        );

        return AthletsResponse;

    }

    public List<Athletes> searchAthletes(String name, String sport, String country) {
        Athletes exampleAthlete = new Athletes();
        if (name != null) {
            exampleAthlete.setName(name);
        }
        if (sport != null) {
            exampleAthlete.setSport(sport);
        }
        if (country != null) {
            exampleAthlete.setNationality(country);
        }

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Athletes> example = Example.of(exampleAthlete, matcher);
        return athletesRepositry.findAll(example);
    }


    public Athletes getAthletesByNationalityByQuery(String nationality) {
        return athletesRepositry.getAtheletesByNationality(nationality);

    }
        public Athletes getAthletesNameByQuery(String name) {
        return  athletesRepositry.getAthletesNameByQuery(name);

    }


}