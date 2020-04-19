package com.chrisgya.beerinventoryservice.model.event;

import com.chrisgya.beerinventoryservice.model.dto.BeerDto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent  extends BeerEvent{
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
