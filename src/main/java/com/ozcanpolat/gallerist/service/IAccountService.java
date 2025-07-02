package com.ozcanpolat.gallerist.service;

import com.ozcanpolat.gallerist.dto.DtoAccount;
import com.ozcanpolat.gallerist.dto.DtoAccountIU;

public interface IAccountService {

	public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);
}
