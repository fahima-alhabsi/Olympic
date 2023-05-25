package com.example.Olympic.ResponseObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetCountryResponse {

    private String countryName;
    private int goldMedals;
    private int silverMedals;
    private int bronzeMedals;
}
