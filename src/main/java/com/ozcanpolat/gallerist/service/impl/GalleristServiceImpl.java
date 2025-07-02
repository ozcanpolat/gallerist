package com.ozcanpolat.gallerist.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozcanpolat.gallerist.dto.DtoAddress;
import com.ozcanpolat.gallerist.dto.DtoGallerist;
import com.ozcanpolat.gallerist.dto.DtoGalleristIU;
import com.ozcanpolat.gallerist.exception.BaseException;
import com.ozcanpolat.gallerist.exception.ErrorMessage;
import com.ozcanpolat.gallerist.exception.MessageType;
import com.ozcanpolat.gallerist.model.Address;
import com.ozcanpolat.gallerist.model.Gallerist;
import com.ozcanpolat.gallerist.repository.AddressRepository;
import com.ozcanpolat.gallerist.repository.GalleristRepository;
import com.ozcanpolat.gallerist.service.IGalleristService;

@Service
public class GalleristServiceImpl implements IGalleristService {

	@Autowired
	private GalleristRepository galleristRepository;

	@Autowired
	private AddressRepository addressRepository;

	private Gallerist createGallerist(DtoGalleristIU dtoGalleristIU) {

		Optional<Address> optAddress = addressRepository.findById(dtoGalleristIU.getAddressId());
		if (optAddress.isEmpty()) {
			throw new BaseException(
					new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristIU.getAddressId().toString()));
		}

		Gallerist gallerist = new Gallerist();
		gallerist.setCreateTime(new Date());

		BeanUtils.copyProperties(dtoGalleristIU, gallerist);
		gallerist.setAddress(optAddress.get());

		return gallerist;

	}

	@Override
	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU) {
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoAddress dtoAddress = new DtoAddress();

		Gallerist savedGallerist = galleristRepository.save(createGallerist(dtoGalleristIU));

		BeanUtils.copyProperties(savedGallerist, dtoGallerist);
		BeanUtils.copyProperties(savedGallerist.getAddress(), dtoAddress);

		dtoGallerist.setAddress(dtoAddress);
		return dtoGallerist;
	}

}
