package com.mitali.msscbrewery.services;

import com.mitali.msscbrewery.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
