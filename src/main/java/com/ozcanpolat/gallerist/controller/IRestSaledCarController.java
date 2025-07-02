package com.ozcanpolat.gallerist.controller;

import com.ozcanpolat.gallerist.dto.DtoSaledCar;
import com.ozcanpolat.gallerist.dto.DtoSaledCarIU;

public interface IRestSaledCarController {

	public RootEntity<DtoSaledCar> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
