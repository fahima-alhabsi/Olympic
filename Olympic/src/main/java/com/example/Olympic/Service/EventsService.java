package com.example.Olympic.Service;

import com.example.Olympic.Repositry.EventRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventsService {
    @Autowired
    EventRepositry eventRepositry;
}
