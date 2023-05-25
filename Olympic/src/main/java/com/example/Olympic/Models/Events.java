




package com.example.Olympic.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Data

public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String eventName;
    private String sport;
    private Date schedule;
    private String results;
}
