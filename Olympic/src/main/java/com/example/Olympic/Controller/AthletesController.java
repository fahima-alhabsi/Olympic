package com.example.Olympic.Controller;


import com.example.Olympic.Service.AthletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
@RestController

public class AthletesController {
    @Autowired
    AthletsService athletsService;
}
