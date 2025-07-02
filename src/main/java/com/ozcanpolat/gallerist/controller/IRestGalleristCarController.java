package com.ozcanpolat.gallerist.controller;

import com.ozcanpolat.gallerist.dto.DtoGalleristCar;
import com.ozcanpolat.gallerist.dto.DtoGalleristCarIU;

public interface IRestGalleristCarController {

	public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
