package com.ozcanpolat.gallerist.service;

import com.ozcanpolat.gallerist.dto.DtoCustomer;
import com.ozcanpolat.gallerist.dto.DtoCustomerIU;

public interface ICustomerService {

	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
}
