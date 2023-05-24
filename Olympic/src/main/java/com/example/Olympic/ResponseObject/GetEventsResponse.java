package com.example.Olympic.ResponseObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEventsResponse {

    private String eventName;
    private String sport;
    private Date schedule;
    private String results;
}
