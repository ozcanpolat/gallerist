package com.ozcanpolat.gallerist.controller;

import com.ozcanpolat.gallerist.dto.DtoAccount;
import com.ozcanpolat.gallerist.dto.DtoAccountIU;

public interface IRestAccountController {

	public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);
}
