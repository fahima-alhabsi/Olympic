package com.example.Olympic.Repositry;

import com.example.Olympic.Models.Athletes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.w3c.dom.events.Event;

public interface EventRepositry extends JpaRepository<Event, Long> {
}
