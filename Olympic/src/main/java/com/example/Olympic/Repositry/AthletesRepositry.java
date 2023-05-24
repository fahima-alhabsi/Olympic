package com.example.Olympic.Repositry;

import antlr.collections.List;
import com.example.Olympic.Models.Athletes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthletesRepositry extends JpaRepository<Athletes, Long> {

}
