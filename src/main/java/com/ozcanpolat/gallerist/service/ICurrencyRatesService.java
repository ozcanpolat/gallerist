package com.ozcanpolat.gallerist.service;

import com.ozcanpolat.gallerist.dto.CurrencyRatesResponse;

public interface ICurrencyRatesService {

	public CurrencyRatesResponse getCurrencyRates(String startDate , String endDate);
}
