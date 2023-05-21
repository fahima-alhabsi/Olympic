




package com.example.Olympic.Models;

import antlr.collections.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class Athletes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nationality;
    private String sport;
    @JoinColumn(name = "Athletes_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Athletes athletes;


    //@ElementCollection
    //private List<String> eventHistory;

}
