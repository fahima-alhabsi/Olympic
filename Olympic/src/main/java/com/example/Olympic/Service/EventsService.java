package com.example.Olympic.Service;

import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Models.CountryMedalStandings;
import com.example.Olympic.Models.Events;
import com.example.Olympic.Repositry.EventRepositry;
import com.example.Olympic.ResponseObject.GetCountryResponse;
import com.example.Olympic.ResponseObject.GetEventsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventsService {
    @Autowired
    EventRepositry eventRepositry;

    public void saveevents(Events events) {
        eventRepositry.save(events);
    }

    public List<Events> getevents() {

        return eventRepositry.findAll();
    }

    public List<Events> getByeventsname(String EventName) {
        Events exampleevent = new Events();
        exampleevent.setEventName(EventName);

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Events> example = Example.of(exampleevent, matcher);
        return eventRepositry.findAll(example);

    }

    public GetEventsResponse getEventsAsString(Events events) {
        GetEventsResponse EventsResponse = new GetEventsResponse(events.getEventName(), events.getSport(),
                events.getResults());
        ;

        return EventsResponse;

    }
}