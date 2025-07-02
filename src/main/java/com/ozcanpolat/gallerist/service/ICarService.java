package com.ozcanpolat.gallerist.service;

import com.ozcanpolat.gallerist.dto.DtoCar;
import com.ozcanpolat.gallerist.dto.DtoCarIU;

public interface ICarService {

	public DtoCar saveCar(DtoCarIU dtoCarIU);
}
