package com.chrisgya.beerinventoryservice.model.event;

import com.chrisgya.beerinventoryservice.model.dto.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {
    private BeerDto beerDto;
}
