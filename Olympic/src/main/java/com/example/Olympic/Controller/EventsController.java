package com.example.Olympic.Controller;

import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Models.Events;
import com.example.Olympic.Service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class EventsController {

    @Autowired
    EventsService eventsService;
    @RequestMapping("events/create")
    public void saveevents() {
        createevents();
    }

    private void createevents() {
        Events events = new Events();
        events.setEventName("olympic");
        events.setSchedule(new Date());
        events.setResults("win");
        events.setSport("run");
    }
}
