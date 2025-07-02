package com.ozcanpolat.gallerist.controller;

import com.ozcanpolat.gallerist.dto.DtoGallerist;
import com.ozcanpolat.gallerist.dto.DtoGalleristIU;

public interface IRestGalleristController {

	public RootEntity<DtoGallerist> saveGallerist(DtoGalleristIU dtoGalleristIU);
}
