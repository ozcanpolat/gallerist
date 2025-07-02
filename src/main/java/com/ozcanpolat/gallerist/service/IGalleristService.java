package com.ozcanpolat.gallerist.service;

import com.ozcanpolat.gallerist.dto.DtoGallerist;
import com.ozcanpolat.gallerist.dto.DtoGalleristIU;

public interface IGalleristService {

	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU);
}
