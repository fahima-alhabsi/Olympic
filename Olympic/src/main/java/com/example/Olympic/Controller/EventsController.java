package com.example.Olympic.Controller;

import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Models.CountryMedalStandings;
import com.example.Olympic.Models.Events;
import com.example.Olympic.Service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

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
        eventsService.saveevents(events);
    }
    @RequestMapping ("events/get")
    public List<Events> getEvents(){
        return eventsService.getevents();
    }

    @RequestMapping(value = "events/get/{events}", method = RequestMethod.GET)
    public List<Events> getEvents(@RequestParam(value = "events", required = false) String events ) {
        if (events != null) {

            return eventsService.getByeventsname(events);
        } else {

            return eventsService.getevents();
        }
    }

    @RequestMapping(value = "events/search", method = RequestMethod.GET)
    public List<Events> searchEvents(
            @RequestParam(value = "eventName", required = false) String eventName,
            @RequestParam(value = "sport", required = false) String sport) {

        return eventsService.searchEvents(eventName, sport);
    }
}
