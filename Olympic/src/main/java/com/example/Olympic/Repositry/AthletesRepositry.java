package com.example.Olympic.Repositry;

import com.example.Olympic.Models.Athletes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthletesRepositry extends JpaRepository<Athletes, Long> {
}
