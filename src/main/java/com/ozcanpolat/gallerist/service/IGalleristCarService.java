package com.ozcanpolat.gallerist.service;

import com.ozcanpolat.gallerist.dto.DtoGalleristCar;
import com.ozcanpolat.gallerist.dto.DtoGalleristCarIU;

public interface IGalleristCarService {

	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
