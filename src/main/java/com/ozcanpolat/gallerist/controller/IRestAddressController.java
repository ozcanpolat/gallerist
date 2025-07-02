package com.ozcanpolat.gallerist.controller;

import com.ozcanpolat.gallerist.dto.DtoAddress;
import com.ozcanpolat.gallerist.dto.DtoAddressIU;

public interface IRestAddressController {

	public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
}
