package com.ozcanpolat.gallerist.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozcanpolat.gallerist.controller.IRestGalleristController;
import com.ozcanpolat.gallerist.controller.RestBaseController;
import com.ozcanpolat.gallerist.controller.RootEntity;
import com.ozcanpolat.gallerist.dto.DtoGallerist;
import com.ozcanpolat.gallerist.dto.DtoGalleristIU;
import com.ozcanpolat.gallerist.service.IGalleristService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/gallerist")
public class RestGalleristControllerImpl extends RestBaseController implements IRestGalleristController{

	@Autowired
	private IGalleristService galleristService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoGallerist> saveGallerist(@Valid @RequestBody DtoGalleristIU dtoGalleristIU) {
		return ok(galleristService.saveGallerist(dtoGalleristIU));
	}

}
