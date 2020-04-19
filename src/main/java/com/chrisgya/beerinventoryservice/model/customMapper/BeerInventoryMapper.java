package com.chrisgya.beerinventoryservice.model.customMapper;

import com.chrisgya.beerinventoryservice.entity.BeerInventory;
import com.chrisgya.beerinventoryservice.model.dto.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {
    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
