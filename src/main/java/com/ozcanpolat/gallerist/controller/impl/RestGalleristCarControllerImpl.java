package com.ozcanpolat.gallerist.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozcanpolat.gallerist.controller.IRestGalleristCarController;
import com.ozcanpolat.gallerist.controller.RestBaseController;
import com.ozcanpolat.gallerist.controller.RootEntity;
import com.ozcanpolat.gallerist.dto.DtoGalleristCar;
import com.ozcanpolat.gallerist.dto.DtoGalleristCarIU;
import com.ozcanpolat.gallerist.service.IGalleristCarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/gallerist-car")
public class RestGalleristCarControllerImpl extends RestBaseController implements IRestGalleristCarController{

	@Autowired
	private IGalleristCarService galleristCarService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoGalleristCar> saveGalleristCar(@Valid @RequestBody DtoGalleristCarIU dtoGalleristCarIU) {
		return ok(galleristCarService.saveGalleristCar(dtoGalleristCarIU));
	}

}
