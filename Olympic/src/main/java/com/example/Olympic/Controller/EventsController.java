package com.example.Olympic.Controller;

import com.example.Olympic.Service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventsController {

    @Autowired
    EventsService eventsService;
}
