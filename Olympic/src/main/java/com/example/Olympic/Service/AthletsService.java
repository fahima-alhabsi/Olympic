package com.example.Olympic.Service;

import com.example.Olympic.Repositry.AthletesRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AthletsService {

    @Autowired
    AthletesRepositry athletesRepositry;
}
