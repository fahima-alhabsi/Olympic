package com.example.Olympic.Repositry;

import antlr.collections.List;
import com.example.Olympic.Models.Athletes;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Table;

@Repository
public interface AthletesRepositry extends JpaRepository<Athletes, Long> {
    @Query("SELECT * FROM Athletes WHERE nationality=:atheletesNationality")
    Athletes getAtheletesByNationality(@Param("atheletesNationality") String nationality);

    @Query("SELECT * FROM Athletes WHERE name=:nameOfAtheletes")
      Athletes getAthletesNameByQuery(@Param("nameOfAtheletes") String name) ;


}
