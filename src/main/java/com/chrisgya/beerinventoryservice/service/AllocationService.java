package com.chrisgya.beerinventoryservice.service;

import com.chrisgya.beerinventoryservice.model.dto.BeerOrderDto;

public interface AllocationService {
    Boolean allocateOrder(BeerOrderDto beerOrderDto);

    void deallocateOrder(BeerOrderDto beerOrderDto);
}
