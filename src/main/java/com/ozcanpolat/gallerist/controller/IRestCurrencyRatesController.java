package com.ozcanpolat.gallerist.controller;

import com.ozcanpolat.gallerist.dto.CurrencyRatesResponse;

public interface IRestCurrencyRatesController {

	public RootEntity<CurrencyRatesResponse> getCurrencyRates(String startDate , String endDate);
}
