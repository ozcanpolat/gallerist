package com.ozcanpolat.gallerist.controller;

import com.ozcanpolat.gallerist.dto.DtoCustomer;
import com.ozcanpolat.gallerist.dto.DtoCustomerIU;

public interface IRestCustomerController {

	public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
