package com.example.Olympic.Repositry;

import com.example.Olympic.Models.Athletes;
import com.example.Olympic.Models.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.events.Event;
@Repository
public interface EventRepositry extends JpaRepository<Events, Long> {
}
