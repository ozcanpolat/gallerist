package com.ozcanpolat.gallerist.service;

import com.ozcanpolat.gallerist.dto.DtoAddress;
import com.ozcanpolat.gallerist.dto.DtoAddressIU;

public interface IAddressService {

	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}
