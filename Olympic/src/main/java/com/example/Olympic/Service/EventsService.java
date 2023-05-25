package com.example.Olympic.Service;

import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Models.Events;
import com.example.Olympic.Repositry.EventRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService {
    @Autowired
    EventRepositry eventRepositry;
    public void saveevents (Events events){
        eventRepositry.save(events);
    }
    public List<Events> getevents() {

        return eventRepositry.findAll();
    }

}
