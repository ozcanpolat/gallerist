package com.ozcanpolat.gallerist.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozcanpolat.gallerist.controller.IRestSaledCarController;
import com.ozcanpolat.gallerist.controller.RestBaseController;
import com.ozcanpolat.gallerist.controller.RootEntity;
import com.ozcanpolat.gallerist.dto.DtoSaledCar;
import com.ozcanpolat.gallerist.dto.DtoSaledCarIU;
import com.ozcanpolat.gallerist.service.ISaledCarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/saled-car")
public class RestSaledCarControllerImpl extends RestBaseController implements IRestSaledCarController{

	@Autowired
	private ISaledCarService saledCarService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoSaledCar> buyCar(@Valid @RequestBody DtoSaledCarIU dtoSaledCarIU) {
		return ok(saledCarService.buyCar(dtoSaledCarIU));
	}

}
