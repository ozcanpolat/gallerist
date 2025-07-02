package com.ozcanpolat.gallerist.controller;

import com.ozcanpolat.gallerist.dto.DtoCar;
import com.ozcanpolat.gallerist.dto.DtoCarIU;

public interface IRestCarController {

	public RootEntity<DtoCar> saveCar(DtoCarIU dtoCarIU);
}
