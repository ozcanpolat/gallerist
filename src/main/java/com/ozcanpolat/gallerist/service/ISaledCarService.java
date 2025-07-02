package com.ozcanpolat.gallerist.service;

import com.ozcanpolat.gallerist.dto.DtoSaledCar;
import com.ozcanpolat.gallerist.dto.DtoSaledCarIU;

public interface ISaledCarService {

	public DtoSaledCar buyCar(DtoSaledCarIU dtoSaledCarIU);
}
